package com.spring.CustomerRegistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CustomerRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerRegistryApplication.class, args);
	}

}