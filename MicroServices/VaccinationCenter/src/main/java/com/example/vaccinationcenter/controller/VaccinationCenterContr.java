package com.example.vaccinationcenter.controller;

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
import org.springframework.web.client.RestTemplate;

import com.example.vaccinationcenter.entities.VaccinationCenter;
import com.example.vaccinationcenter.model.Citizen;
import com.example.vaccinationcenter.model.RequiredResponse;
import com.example.vaccinationcenter.repo.CenterRepo;
import com.example.vaccinationcenter.service.OpenFeinClientService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;

@RestController
@RequestMapping("/vaccinationcenter")
public class VaccinationCenterContr {
	@Autowired
	private CenterRepo centerRepo;
	@Autowired 
	private RestTemplate restTemplate;
	@Autowired
	private OpenFeinClientService ofc;

	@PostMapping(path="/add")
	public ResponseEntity<VaccinationCenter> addCitizen(@RequestBody VaccinationCenter vc){
		return new ResponseEntity<>(centerRepo.save(vc),HttpStatus.OK);
	}
	
	
	@GetMapping(path="/id/{id}")
	@HystrixCommand(fallbackMethod="handleCitizenDownTime")
	@HystrixProperty(name = "execution.isolation.thread.timeoutInMilliSeconds", value = "500")
	public ResponseEntity<RequiredResponse> getAllDataBasedOnCenterId(@PathVariable int id){
		System.out.println("VaccinationCenterContr.getAllDataBasedOnCenterId()");
		RequiredResponse rs=new RequiredResponse();
		VaccinationCenter vc=centerRepo.findById(id).get();
		System.out.println(centerRepo.findById(id).isPresent());
		System.out.println(vc);
		//List<Citizen> liCitizen=restTemplate.getForObject("http://CITIZEN-SERVICE/citizen/id/"+id,List.class);
		List<Citizen> liCitizen=ofc.getCitizen(id);
		rs.setVc(vc);
		rs.setCitizen(liCitizen);
	    return new ResponseEntity<>(rs,HttpStatus.OK);
	}
	public ResponseEntity<RequiredResponse> handleCitizenDownTime(@PathVariable int id){
		System.out.println("VaccinationCenterContr.handleCitizenDownTime()");
		RequiredResponse rs=new RequiredResponse();
		VaccinationCenter vc=centerRepo.findById(id).get();
		rs.setVc(vc);
		return new ResponseEntity<>(rs,HttpStatus.OK);
		
	}
	
	@PostMapping("/addCitizen")
	public ResponseEntity<String> addCitizen(@RequestBody Citizen cit){
		Citizen citi=restTemplate.postForEntity("http://CITIZEN-SERVICE/citizen/add", cit,Citizen.class).getBody();
		return new ResponseEntity<>("Inserted",HttpStatus.OK);
	}
}
