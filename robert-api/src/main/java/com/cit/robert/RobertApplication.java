package com.cit.robert;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

import com.cit.robert.config.RibbonConfiguration;

/**
 * Hey, eu faço parte da banda, minha responsabilidade é cantar.
 */
@EnableEurekaClient
@EnableFeignClients
@RibbonClient(name="ribbon-robert-api", configuration = RibbonConfiguration.class)
@SpringBootApplication
public class RobertApplication {

	public static void main(String[] args) {
		SpringApplication.run(RobertApplication.class, args);
	}
}
