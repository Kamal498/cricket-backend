package com.api.cricket.cricketbackend;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
@EnableEurekaClient
public class CricketBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(CricketBackendApplication.class, args);
	}

	@Value("${baseUrl}")
	private String base_url;

	@Bean
	public WebClient webClient(){
		WebClient webClient = WebClient.builder().baseUrl(base_url).build();
		return webClient;
	}
}
