package com.shristi.service;

import org.springframework.stereotype.Service;

@Service
public class GreetServiceImpl implements IGreeterService{

	@Override
	public String greetUser(String username) {
		return "Have a great day " +username;
	}

}