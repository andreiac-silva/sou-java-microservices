package com.cit.jimmy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * Hey, eu faço parte da banda, minha responsabilidade é tocar guitarra.
 */
@EnableEurekaClient
@EnableHystrix
@EnableHystrixDashboard
@EnableFeignClients
@SpringBootApplication
public class JimmyApplication {

	public static void main(String[] args) {
		SpringApplication.run(JimmyApplication.class, args);
	}
}
