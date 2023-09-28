package com.example.securityjpademo;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.securityjpademo.entities.User;
import com.example.securityjpademo.exceptions.UserNameNotFoundException;
import com.example.securityjpademo.repo.UserRepo;

@Service
public class MyUserDetailsService implements UserDetailsService {
  
	@Autowired
	UserRepo userRepo;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		Optional<User> us=userRepo.findByUserName(username);
			us.orElseThrow(()->new UserNameNotFoundException("Not Found"));

		return  us.map(MyUserDetails::new).get();
	}

}
