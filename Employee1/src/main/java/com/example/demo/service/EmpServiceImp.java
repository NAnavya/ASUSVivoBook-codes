package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Employee;
import com.example.demo.repo.EmpRepo;

@Service
public class EmpServiceImp {
	@Autowired 
	EmpRepo empRepo;

	public List<Employee> getAllEmp() {
		// TODO Auto-generated method stub
		
		return empRepo.findAll();
	}

	public Employee getEmpById(int id) {
		// TODO Auto-generated method stub
		return empRepo.findById(id).orElseThrow();
	}

	public String addEmp(Employee emp) {
		// TODO Auto-generated method stub
		System.out.println("added");
		empRepo.save(emp);
		return "Added";
	}

	public String updateEmp(Employee emp,int id) {
		// TODO Auto-generated method stub
		Employee e=empRepo.findById(id).orElseThrow();
		e.setFirstName(emp.getFirstName());
		e.setLastName(emp.getLastName());
		e.setSal(emp.getSal());
		e.setAge(emp.getAge());
		empRepo.save(e);
		return "Updated";
	}

	public String deleteEmp(int id) {
		// TODO Auto-generated method stub
		empRepo.deleteById(id);
		return "deleted";
	}



}
