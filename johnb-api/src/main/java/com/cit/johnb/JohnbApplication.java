package com.cit.johnb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Hey, eu faço parte da banda, minha responsabilidade é tocar bateria.
 */
@EnableEurekaClient
@SpringBootApplication
public class JohnbApplication {

	public static void main(String[] args) {
		SpringApplication.run(JohnbApplication.class, args);
	}
}
