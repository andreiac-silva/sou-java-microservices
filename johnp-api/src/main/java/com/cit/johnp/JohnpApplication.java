package com.cit.johnp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Hey, eu faço parte da banda, minha responsabilidade é tocar baixo.
 */
@EnableEurekaClient
@SpringBootApplication
public class JohnpApplication {

	public static void main(String[] args) {
		SpringApplication.run(JohnpApplication.class, args);
	}
}
