package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.entities.Employee;
import com.example.demo.repo.EmpRepo;
import com.example.demo.service.EmpServiceImp;




/*Optional.of : Used to ensure that there is no null, if null is entered, nullPointExcepction

Optional.ofNullable : may or may not be null. Used to respond flexibly.

So, if I add orElseThrow(() -> new NullPointerException("null data")) to this, will it end up being the same?

I want to throw an error with explicit content.

So I get Optional.ofNullable(data).orElseThrow(() -> new NullPointerException("null data")))

use it as Is this pointless behaviour?

Optional.of(data).orElseThrow(() -> new NullPointerException("null data")))
*/

@SpringBootTest
@ExtendWith(MockitoExtension.class)
class Employee1ApplicationTests {
	
	
	@InjectMocks
	private EmpServiceImp empService;
	
	//EmpRepo empRepo=Mockito.mock(EmpRepo.class)  It is used to create the mock(fake) objects to that class
	
	//@Mock creates a mock. @InjectMocks creates an instance of the class and injects the mocks that are created with the @Mock (or @Spy) annotations into this instance.

	//Remember to use @RunWith(MockitoJUnitRunner.class) or @ExtendWith(MockitoExtension.class) at the class level to enable Mockito annotations in your test class.

	@Mock
	private EmpRepo empRepo;

	@Test
	 public void getEmpById() {
		when(empRepo.findById(1)).thenReturn(Optional.of(new Employee(1,"Navya","Kumari",12222,12,"navya")));
		
		Employee emp=empService.getEmpById(1);
		assertEquals("Navya",emp.getFirstName());
	}
	
	
	@Test
	public void getEmp() {
		Employee e1=new Employee(1,"Navya","Kumari",12222,12,"navya");
		Employee e2=new Employee(2,"Navya1","Kumari1",1222,122,"navya");
		List<Employee> e=new ArrayList<>();
		e.add(e1);
		e.add(e2);
	//	when(empRepo.findAll()).thenReturn(Arrays.asList(e1,e2));
		when(empRepo.findAll()).thenReturn(e);
		List<Employee> emp=empRepo.findAll();
		assertEquals(2,emp.size());
		assertEquals(e1,emp.get(0));
		assertEquals(e2,emp.get(1));
	}
	
	@Test
	public void createEmp() {
		Employee e1=new Employee(1,"Navya","Kumari",12222,12,"navya");
		
		when(empRepo.save(e1)).thenReturn(e1);
		String e=empService.addEmp(e1);
		assertEquals("Added",e);
		
	}
	
	@Test
	public void delEmp() {
		//when(empRepo.deleteById(1)).thenReturn("Deleted");
		String e=empService.deleteEmp(1);
		assertEquals("deleted",e);// This is also working
		verify(empRepo).deleteById(1); //This is condition to check
		
	}
	
	@Test
	public void updateEmp() {
		Employee emp=new Employee(1,"Navya","Kumari",12222,12,"navya");
		Employee existingEmp=new Employee(2,"Navya2","Kumari2",12222,12,"navya");
		when(empRepo.findById(1)).thenReturn(Optional.of(emp));
		when(empRepo.save(emp)).thenReturn(emp);
//		verify(empRepo).findById(1); here it is not working before assertEquals
//		verify(empRepo).save(emp);
//		verify(empService.updateEmp(emp,1));
		assertEquals("Updated",empService.updateEmp(emp, 1));
		verify(empRepo).findById(1);
		verify(empRepo).save(emp);
	//	verify(empService.updateEmp(emp,1)); here verify method is not working  for service
		
		
	}

}
