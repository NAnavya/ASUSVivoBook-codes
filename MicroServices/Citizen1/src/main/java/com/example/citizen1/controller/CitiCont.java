package com.example.citizen1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.citizen1.entity.Citizen;
import com.example.citizen1.repo.CitiRepo;

@RestController
@RequestMapping("/Citizen")
public class CitiCont {
	@Autowired CitiRepo citiRepo;
	@PostMapping("/add")
	public ResponseEntity<Citizen> addCitizen(@RequestBody Citizen c){
		return new ResponseEntity<>(citiRepo.save(c),HttpStatus.OK);
	}
	
	@GetMapping("/get")
	public ResponseEntity<List<Citizen>> getCitizen(){
		return new ResponseEntity<>(citiRepo.findAll(),HttpStatus.OK);
	}
	
	@GetMapping("/id/{id}")
	public ResponseEntity<List<Citizen>> getCitizenBasedOnVaccId(@PathVariable int id){
		return new ResponseEntity<>(citiRepo.findByVaccinationcenterId(id),HttpStatus.OK);
	}

}
