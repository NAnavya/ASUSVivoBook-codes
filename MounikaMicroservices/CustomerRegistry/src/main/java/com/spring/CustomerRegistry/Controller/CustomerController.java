package com.spring.CustomerRegistry.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.CustomerRegistry.DTO.CustomerDTO;
import com.spring.CustomerRegistry.Entity.Customer;
import com.spring.CustomerRegistry.Service.CustomerService;

@RestController
@RequestMapping("rest/customer")
public class CustomerController {

	@Autowired
	CustomerService customerService;

	@PostMapping
	@PreAuthorize("hasRole('ADMIN')")
	public ResponseEntity<CustomerDTO> created(@RequestBody CustomerDTO customerDTO) {
		CustomerDTO customerDTO1 = customerService.create(customerDTO);

		return new ResponseEntity<>(customerDTO1, HttpStatus.CREATED);
	}

	@GetMapping
	public List<Customer> findAll() {
		return customerService.findAll();
	}

	/*
	 * @GetMapping("{id}") public ResponseEntity<CustomerDTO>
	 * getId(@PathVariable("id") long id) { CustomerDTO
	 * customerDTO1=customerService.findById(id); return
	 * ResponseEntity.ok(customerDTO1); }
	 */

	@GetMapping("{email}")
	public Customer email(@PathVariable("email") String email) {
		Customer customer = customerService.findByemail(email);
		return customer;
	}

	@PutMapping("{id}")
	@PreAuthorize("hasRole('ADMIN')")
	public ResponseEntity<CustomerDTO> update(@RequestBody CustomerDTO customerDTO, @PathVariable("id") long id) {
		CustomerDTO customerDTO1 = customerService.update(customerDTO, id);
		return ResponseEntity.ok(customerDTO1);
	}

	@DeleteMapping("{id}")
	@PreAuthorize("hasRole('ADMIN')")
	public ResponseEntity<String> delete(@PathVariable("id") long id) {
		customerService.delete(id);
		return ResponseEntity.ok("Succesfully Deleted");

	}

}
