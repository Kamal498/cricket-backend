package com.api.cricket.cricketgateway.config;

import com.api.cricket.cricketgateway.filter.JwtAuthenticationFilter;
import io.github.resilience4j.circuitbreaker.CircuitBreakerConfig;
import io.github.resilience4j.timelimiter.TimeLimiterConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.cloud.circuitbreaker.resilience4j.ReactiveResilience4JCircuitBreakerFactory;
import org.springframework.cloud.circuitbreaker.resilience4j.Resilience4JCircuitBreakerFactory;
import org.springframework.cloud.circuitbreaker.resilience4j.Resilience4JConfigBuilder;
import org.springframework.cloud.client.circuitbreaker.Customizer;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.Duration;

@Configuration
public class GatewayConfig {

    @Autowired
    private JwtAuthenticationFilter filter;

    @Bean
    public RouteLocator routes(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("CRICKET-AUTH-SERVICE", r -> r
                        .path("/auth/**")
                        .filters(f -> f
                                .filter(filter)
                                .circuitBreaker(c -> c.setName("CRICKET-AUTH-SERVICE-CB").setFallbackUri("/defaultFallback")))
                        .uri("lb://CRICKET-AUTH-SERVICE"))
                .route("CRICKET-MATCHES-API", r -> r
                        .path("/cricket/matches/**")
                        .filters(f -> f
                                .filter(filter)
                                .circuitBreaker(c -> c.setName("CRICKET-MATCHES-API-CB").setFallbackUri("/defaultFallback")))
                        .uri("lb://CRICKET-MATCHES-API"))
                .route("CRICKET-PLAYERS-API", r -> r
                        .path("/cricket/players/**")
                        .filters(f -> f
                                .filter(filter)
                                .circuitBreaker(c -> c.setName("CRICKET-PLAYERS-API-CB").setFallbackUri("/defaultFallback")))
                        .uri("lb://CRICKET-PLAYERS-API"))
                .build();
//                .route("echo", r -> r.path("/echo/**").filters(f -> f.filter(filter)).uri("lb://echo"))
//                .route("hello", r -> r.path("/hello/**").filters(f -> f.filter(filter)).uri("lb://hello")).build();

    }

    @Bean
    public Customizer<Resilience4JCircuitBreakerFactory> defaultCustomizer () {

        return factory->factory.configureDefault(id->new Resilience4JConfigBuilder(id)
                .circuitBreakerConfig(CircuitBreakerConfig.ofDefaults())
                .timeLimiterConfig(TimeLimiterConfig.custom()
                        .timeoutDuration(Duration.ofSeconds(5)).build()).build());

    }
}
