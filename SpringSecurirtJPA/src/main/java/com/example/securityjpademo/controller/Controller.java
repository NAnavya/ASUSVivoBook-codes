package com.example.securityjpademo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@GetMapping("/")
	public String home() {
		return("<h1>WelcomeHome</h1>");
		
	}
	@GetMapping("/user")
	public String user() {
		System.out.println("works");
		return("<h1>WelcomeUser<h1>");
		
	}
	@GetMapping("/admin")
	public String admin() {
		return("<h1>WelcomeAdmin<h1>");
	}

}
