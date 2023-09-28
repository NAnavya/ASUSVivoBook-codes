package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entities.Employee;
import com.example.demo.repo.EmpRepo;
import com.example.demo.service.EmpServiceImp;

@Controller
@CrossOrigin("*")
public class ControllerJsp {
	@Autowired 
	EmpServiceImp empser;
	@Autowired 
	EmpRepo empRepo;
	
	@RequestMapping("/")
	public String  home() {
		return "home";
	}
	@RequestMapping("addEmp")
	public String addEmp() {
		return "addEmp";
	}
	@RequestMapping(path="UpdateEmps/{id}" )
		public ModelAndView updateData(@PathVariable int id) {
		Employee emp=empRepo.findById(id).get();
		ModelAndView mv=new ModelAndView("edit");
		mv.addObject("empdata",emp);
		return mv;
	}
//	
//	@GetMapping(value="image/{imageName}",produces = MediaType.IMAGE_JPEG_VALUE)
//    @ResponseBody
//    public Resource getImage(@PathVariable String imageName) {
//		return new ClassPathResource(imageName);
//	}
	
//	@Autowired
//	PasswordEncoder passwordEncoder;	
	@GetMapping("getEmployees")
	public ModelAndView getEmployees() {
		System.out.println("Yes");
		List<Employee> emp=empser.getAllEmp();
		ModelAndView mv=new ModelAndView("Emp");
		mv.addObject("empli",emp);
		return mv;				
	}
	
	@GetMapping("getEmpById/{id}")
	public ModelAndView getEmpById(@PathVariable int id){
	Employee emp=	empser.getEmpById(id);
	  ModelAndView mv=new ModelAndView("viewEmp");
	  mv.addObject("empdata",emp);
		return mv;
	}
	
	@PostMapping("addEmp")
	public String addEmp(@ModelAttribute Employee emp) {
		System.out.println("added");
		//emp.setPassword(passwordEncoder.encode(emp.getPassword()));\
		empser.addEmp(emp);
		return "redirect:/";
		
	}
	
	@RequestMapping(path="UpdateEmp")
	public String updateEmp(@ModelAttribute Employee emp){
		//emp.setPassword(passwordEncoder.encode(emp.getPassword()));
		empser.updateEmp(emp,emp.getId());
		return "redirect:/getEmployees";
	}
	@RequestMapping("deleteEmp/{id}")
	public String delEmp(@PathVariable int id){
		empser.deleteEmp(id);
		return "redirect:/getEmployees";
	}

}