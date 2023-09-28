package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Employee;
import com.example.demo.service.EmpServiceImp;

@RestController
@RequestMapping("/Restcontroller")
@CrossOrigin("*")
public class EmpController {
	
	@Autowired 
	EmpServiceImp empser;
	
//	@Autowired
//	PasswordEncoder passwordEncoder;
	
	@GetMapping("getEmployees")
	public ResponseEntity<List<Employee>> getEmployees() {
		System.out.println("Yes");
		List<Employee> emp=empser.getAllEmp();
		return new ResponseEntity<List<Employee>>(emp,HttpStatus.OK);
				
	}
	
	@GetMapping("getEmpById/{id}")
	public ResponseEntity<Employee> getEmpById(@PathVariable int id){
		return new ResponseEntity<Employee>(empser.getEmpById(id),HttpStatus.OK);
	}
	
	@PostMapping("addEmp")
	public ResponseEntity<String> addEmp(@RequestBody Employee emp) {
		System.out.println("added");
		//emp.setPassword(passwordEncoder.encode(emp.getPassword()));
		return new ResponseEntity<String>(empser.addEmp(emp),HttpStatus.OK);
		
	}
	
	@RequestMapping(path="UpdateEmp/{id}" ,method=RequestMethod.PUT)
	public ResponseEntity<String> updateEmp(@RequestBody Employee emp,@PathVariable int id){
		//emp.setPassword(passwordEncoder.encode(emp.getPassword()));
		return new ResponseEntity<String>(empser.updateEmp(emp,id),HttpStatus.ACCEPTED);
	}
	@DeleteMapping("deleteEmp/{id}")
	public ResponseEntity<String> delEmp(@PathVariable int id){
		return new ResponseEntity<String>(empser.deleteEmp(id),HttpStatus.OK);
	}

}