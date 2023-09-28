package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Employee;
import com.example.demo.repo.EmpRepo;

@Service
public class MyUserDetailsService implements UserDetailsService {

	@Autowired EmpRepo empRepo;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		Employee emp=empRepo.findByFirstName(username);
		if(emp==null)
			throw new UsernameNotFoundException("Not Found");
		return new UserPrincipal(emp);
	}

}
