package com.api.cricket.cricketplayersapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CricketPlayersApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(CricketPlayersApiApplication.class, args);
	}

}
