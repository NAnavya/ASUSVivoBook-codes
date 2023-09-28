package com.example.vaccinationcenter1.cont;

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

import com.example.vaccinationcenter1.entity.VaccinationCenter;
import com.example.vaccinationcenter1.model.Citizen;
import com.example.vaccinationcenter1.model.RequiredResponse;
import com.example.vaccinationcenter1.repo.VacRepo;

@RestController
@RequestMapping("/vaccinationCenter")
public class VacCont {
	
	@Autowired VacRepo vacRepo;
	@Autowired RestTemplate rt;
	@PostMapping("/add")
	public ResponseEntity<VaccinationCenter> add(@RequestBody VaccinationCenter vc){
		return new ResponseEntity<>(vacRepo.save(vc),HttpStatus.OK);
	}
	
	@GetMapping("/getRecords/id/{id}")
	public ResponseEntity<RequiredResponse> get(@PathVariable int id){
		RequiredResponse rs=new RequiredResponse();
		VaccinationCenter vc=vacRepo.findById(id).get();
		System.out.println(vacRepo.findById(id).isPresent());
		
		List<Citizen> li=rt.getForObject("http://localhost:8081/Citizen/id/"+id,List.class);
		rs.setCitizen(li);
		System.out.println(li);
		rs.setVc(vc);
		return new ResponseEntity<>(rs,HttpStatus.OK);
		
		
	}

}
