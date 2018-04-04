package com.cit.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Esse cara, é o nosso Cristóvão Colombo (invejosos dirão que poderia ser Vikings).
 */
@EnableEurekaServer
@SpringBootApplication
public class DiscoveryApplication {
	public static void main(String[] args) {
		SpringApplication.run(DiscoveryApplication.class, args);
	}
}
