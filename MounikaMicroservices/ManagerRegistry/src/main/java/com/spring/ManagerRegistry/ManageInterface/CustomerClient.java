package com.spring.ManagerRegistry.ManageInterface;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.spring.ManagerRegistry.Entity.CustomerDTO;



@FeignClient("CUSTOMER-REGISTRY")
public interface CustomerClient {
	@GetMapping("rest/customer/{email}")
	public CustomerDTO getEmail(@PathVariable("email") String email);

}