package com.example.securityjpademo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.example.securityjpademo.repo.UserRepo;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = UserRepo.class )
public class SpringSecurityJPA {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityJPA.class, args);
	}

}
