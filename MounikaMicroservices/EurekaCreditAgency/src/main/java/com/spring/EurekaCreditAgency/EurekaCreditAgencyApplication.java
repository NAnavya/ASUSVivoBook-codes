package com.spring.EurekaCreditAgency;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaCreditAgencyApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaCreditAgencyApplication.class, args);
	}

}