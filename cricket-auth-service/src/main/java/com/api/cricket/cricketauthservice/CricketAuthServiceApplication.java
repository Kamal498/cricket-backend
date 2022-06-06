package com.api.cricket.cricketauthservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CricketAuthServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CricketAuthServiceApplication.class, args);
	}

}
