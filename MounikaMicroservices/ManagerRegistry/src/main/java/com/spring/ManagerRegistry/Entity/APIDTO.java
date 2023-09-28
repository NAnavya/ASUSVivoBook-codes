package com.spring.ManagerRegistry.Entity;

public class APIDTO {
	public CustomerDTO customerDTO;
	public Manager manager;
	public CustomerDTO getCustomerDTO() {
		return customerDTO;
	}
	public void setCustomerDTO(CustomerDTO customerDTO) {
		this.customerDTO = customerDTO;
	}
	public Manager getManager() {
		return manager;
	}
	public void setManager(Manager manager) {
		this.manager = manager;
	}

}
