package com.api.cricket.cricketconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EnableConfigServer
@RefreshScope
public class CricketConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CricketConfigServerApplication.class, args);
	}

}
