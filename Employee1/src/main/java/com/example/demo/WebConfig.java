package com.example.demo;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

//passwordEncoder.encode()  //to encrypt the data
//passwordEncoder.matches("sas",password);  to compare
//${SPRING_SECURITY_LAST_EXCEPTION.message}

@Configuration
@EnableWebSecurity
public class WebConfig extends WebSecurityConfigurerAdapter{
	
	@Bean
	protected UserDetailsService userDetailsService() {
		List<UserDetails>  users=new ArrayList<>();
		users.add(User.withDefaultPasswordEncoder().username("navya").password("1234").roles("doctor").build());
		return new InMemoryUserDetailsManager(users);		
	}
	
	@Bean 
	protected BCryptPasswordEncoder passwordEncoder(){
		return new BCryptPasswordEncoder();
	}
	@Autowired
	UserDetailsService userDetailsService;
	@Bean
	public AuthenticationProvider authProvider() {
		DaoAuthenticationProvider provider=new DaoAuthenticationProvider();
		provider.setUserDetailsService(userDetailsService);
		provider.setPasswordEncoder(NoOpPasswordEncoder.getInstance());
		//provider.setPasswordEncoder( new BCryptPasswordEncoder() );
		return provider;
	}
	
	@Bean
	public void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder());
	}
	
	
	
	protected void configure(HttpSecurity http) throws Exception{
		http
		   .csrf().disable()
		   .authorizeRequests().antMatchers("/login").permitAll()
		   .anyRequest().authenticated()
		   .and()
		   .formLogin()
		   .loginPage("/login").permitAll()
		   .and()
		   .logout().invalidateHttpSession(true)
		   .clearAuthentication(true)
		   .logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
		   .logoutSuccessUrl("/logout-success")
		   .permitAll();
	}
}
