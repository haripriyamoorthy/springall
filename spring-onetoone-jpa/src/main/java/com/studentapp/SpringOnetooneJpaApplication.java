package com.studentapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import com.studentapp.Service.IStudentService;
import com.studentapp.model.Studentdto;
import com.studentapp.model.Addressdto;



@SpringBootApplication
public class SpringOnetooneJpaApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringOnetooneJpaApplication.class, args);
	}
	@Autowired
	private IStudentService studentservice;

	@Override
	public void run(String... args) throws Exception {
		// create a productdto object
		Addressdto addressDTO = new Addressdto(null, "New York", "NY", "10001");

			        // Create StudentDTO
		Studentdto studentDTO = new Studentdto(null, "John Doe", "Computer Science", addressDTO);

		
		//call the method of service layer;
		studentservice.addStudent(studentDTO);
		
		Studentdto nstudentDTO = studentservice.getById(1);
		System.out.println(nstudentDTO);
		
		//update- call setter methods
		nstudentDTO.setDepartment("Electronics");;
		studentservice.updateStudent(nstudentDTO);
		
		
		
		
	}
}
