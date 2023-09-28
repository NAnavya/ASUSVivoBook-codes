package com.example.demo;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.entities.Employee;
import com.example.demo.service.EmpServiceImp;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class EmployeeJUnitTest {
	
	@Autowired EmpServiceImp emp;
	Employee e;
	
	@BeforeEach
	public void create() {
	// e=new Employee(1,"Navya","kumari",12,12);
		System.out.println("1");
	}
		
	@Test
	@Order(1)
	public void testAdd() {
		String a=emp.addEmp(e);
		Assertions.assertEquals("Added",a);
		System.out.println("2");
	}
	
	@Test
	@Order(2)
	public void getEmpId() {
		Employee e1=emp.getEmpById(1);
		Assertions.assertNotNull(e1);
		Assertions.assertEquals(e.getId(), e1.getId());
	}
	
	@Test
	@Order(3)
	public void getAllEmp() {
		List<Employee> li=emp.getAllEmp();
		Assertions.assertEquals(1,li.size());
		Assertions.assertEquals(e.getFirstName(),li.get(0).getFirstName());
		Assertions.assertNotNull(li);
		System.out.println("3");
	}

	@Test
	@Order(5)
	public void delete() {
		String a=emp.deleteEmp(1);
		System.out.println(a);
	//	 boolean deleted = employeeService.deleteEmpById(empId);
	    //    Assertions.assertTrue(deleted);
		Assertions.assertEquals("deleted",a);
		
	}
	
	@Test
	@Order(4)
	public void updEmp() {
		Employee e1=new Employee(1,"Navya1","kumari1",12,12,"navya");
		String a=emp.updateEmp(e1, 1);
		Assertions.assertEquals("Updated",a);				
	}

}
