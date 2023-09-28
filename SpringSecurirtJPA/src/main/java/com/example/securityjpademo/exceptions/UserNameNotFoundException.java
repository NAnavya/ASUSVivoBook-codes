package com.example.securityjpademo.exceptions;

public class UserNameNotFoundException extends RuntimeException {
	public UserNameNotFoundException(String s) {
		super(s);
	}

}
