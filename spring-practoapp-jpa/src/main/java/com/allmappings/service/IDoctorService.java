package com.allmappings.service;

import java.util.List;

import com.allmappings.model.Doctor;
import com.allmappings.model.DoctorDto;

public interface IDoctorService {

   
    List<DoctorDto> getAllDoctors();

   
	void addDoctor(DoctorDto doctorDto);
	


	List<DoctorDto> findByname(String name);


	List<DoctorDto> getDoctorById(Integer doctorId);
	

	
}
