package com.example.vaccinationcenter.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.vaccinationcenter.model.Citizen;

@FeignClient(name="CITIZEN-SERVICE")
public interface OpenFeinClientService {
	
	//@GetMapping("http://CITIZEN-SERVICE/citizen/id/{id}")
	@GetMapping("/citizen/id/{id}")
	public List<Citizen> getCitizen(@PathVariable int id);

}
