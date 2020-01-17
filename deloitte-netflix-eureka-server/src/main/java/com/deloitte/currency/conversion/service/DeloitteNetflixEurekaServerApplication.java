package com.deloitte.currency.conversion.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableDiscoveryClient
@EnableEurekaServer
public class DeloitteNetflixEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DeloitteNetflixEurekaServerApplication.class, args);
	}

}
