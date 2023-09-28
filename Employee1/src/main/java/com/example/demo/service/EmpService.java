package com.example.demo.service;

import java.util.List;

import com.example.demo.entities.Employee;

public interface EmpService {
	public List<Employee> getAllEmp();
	public Employee getEmpById(int id) ;
	public String addEmp(Employee emp);
	public String updateEmp(Employee emp,int id);                                      
	public String deleteEmp(int id);

}
