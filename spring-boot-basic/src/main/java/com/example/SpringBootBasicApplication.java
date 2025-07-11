package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.shristi.service.IGreeterService;

@SpringBootApplication(scanBasePackages = {"com.example","com.shristi"})
public class SpringBootBasicApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringBootBasicApplication.class, args);
	}
	
	private IGreeterService greeterService;
	@Autowired
	public void setGreeterService(IGreeterService greeterService) {
		this.greeterService = greeterService;
	}

	@Override
	public void run(String... args) throws Exception {
		
		System.out.println(greeterService.greetUser("Sripriya"));
	}

}