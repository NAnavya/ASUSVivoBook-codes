package com.spring.CustomerRegistry.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.CustomerRegistry.DTO.CustomerDTO;
import com.spring.CustomerRegistry.Entity.Customer;
import com.spring.CustomerRegistry.Repository.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	CustomerRepository customerRepository;
	
	public CustomerDTO create(CustomerDTO customerDTO)
	{
		Customer customer=new Customer(customerDTO.getId(),customerDTO.getName(),customerDTO.getMobile(),
				customerDTO.getEmail(),customerDTO.getUsername(),customerDTO.getPassword());
		customerRepository.save(customer);
		CustomerDTO customerDTO1=new CustomerDTO(customer.getId(),customer.getName(),customer.getMobile(),
				customer.getEmail(),customer.getUsername(),customer.getPassword());
		return customerDTO1;
	}
	
	public List<Customer> findAll()
	{
		List<Customer> list=customerRepository.findAll();
		return list;
	}
	
/*	public CustomerDTO findById(long id)
	{
		Customer customer=customerRepository.findById(id).get();
		CustomerDTO customerDTO1=new CustomerDTO(customer.getId(),customer.getName(),customer.getMobile(),
				customer.getEmail(),customer.getUsername(),customer.getPassword());
		return customerDTO1;
	}*/
	
	public Customer findByemail(String email)
	{
		Customer customer=customerRepository.findByEmail(email);
		CustomerDTO customerDTO1=new CustomerDTO(customer.getId(),customer.getName(),customer.getMobile(),
				customer.getEmail(),customer.getUsername(),customer.getPassword());
		return customer;
	}
	
	public CustomerDTO update(CustomerDTO customerDTO,long id)
	{
		Customer customer=customerRepository.findById(id).get();
		customer=new Customer(id,customerDTO.getName(),customerDTO.getMobile(),
				customerDTO.getEmail(),customerDTO.getUsername(),customerDTO.getPassword());
		customerRepository.save(customer);
		CustomerDTO customerDTO1=new CustomerDTO(customer.getId(),customer.getName(),customer.getMobile(),
				customer.getEmail(),customer.getUsername(),customer.getPassword());
		return customerDTO1;

		
	}
	
	public void delete(long id)
	{
		customerRepository.deleteById(id);
	}
}
