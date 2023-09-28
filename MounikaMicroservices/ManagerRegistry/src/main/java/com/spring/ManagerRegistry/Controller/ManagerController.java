

package com.spring.ManagerRegistry.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.ManagerRegistry.Entity.APIDTO;
import com.spring.ManagerRegistry.Entity.CustomerDTO;
import com.spring.ManagerRegistry.Entity.Manager;
import com.spring.ManagerRegistry.ManageInterface.CustomerClient;
import com.spring.ManagerRegistry.Repository.ManagerRepository;

import io.github.resilience4j.retry.annotation.Retry;

@RestController
@RequestMapping("rest/manager")
public class ManagerController {
	@Autowired
	ManagerRepository managerRepository;
	@Autowired
	CustomerClient customerClient;
	@PostMapping
	@Retry(name="manager-api",fallbackMethod="handleError")
	public ResponseEntity<APIDTO> create(@RequestBody Manager manager)
	{
		Manager manager1=managerRepository.save(manager);
		CustomerDTO c=customerClient.getEmail(manager.getEmail());
		APIDTO a=new APIDTO();
		a.setCustomerDTO(c);
		a.setManager(manager1);
		return new ResponseEntity<>(a,HttpStatus.CREATED);
	}
	public ResponseEntity<String> handleError(Manager manager,Exception exception)
	{
		System.out.println("error");
		APIDTO a=new APIDTO();
	//	a.setCustomerDTO(c);
		a.setManager(manager);
		return new ResponseEntity<>("Service down",HttpStatus.CREATED);
	}
	@GetMapping
	public List<Manager> get()
	{
		return managerRepository.findAll();
	}
	@GetMapping("{id}")
	public ResponseEntity<Manager> getId(@PathVariable long id)
	{
		Manager manager1=managerRepository.findById(id).get();
		return ResponseEntity.ok(manager1);
	}
	@PutMapping("{id}")
	public ResponseEntity<Manager> update(@RequestBody Manager manager,@PathVariable long id)
	{
		Manager manager1=managerRepository.findById(id).get();
		manager1.setId(id);
		manager1.setUsername(manager.getUsername());
		manager1.setPassword(manager.getPassword());
		manager1.setLoanamount(manager.getLoanamount());
		Manager manager2=managerRepository.save(manager1);
		return new ResponseEntity<>(manager2,HttpStatus.CREATED);

	}
	@DeleteMapping("{id}")
	public String delete(@PathVariable long id)
	{
		managerRepository.deleteById(id);
		return "deleted";
	}

}

