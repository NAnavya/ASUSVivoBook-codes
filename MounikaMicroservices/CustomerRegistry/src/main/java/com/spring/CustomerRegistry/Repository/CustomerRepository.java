package com.spring.CustomerRegistry.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.CustomerRegistry.Entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer,Long>{
	
	public Customer findByEmail(String email);

}
