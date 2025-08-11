package com.allmappings.service;

import java.util.List;

import com.allmappings.model.Hospital;
import com.allmappings.model.HospitalDto;
import com.allmappings.model.Speciality;

public interface IHospitalService {
	 void addHospital(HospitalDto hospitalDto);
	    void  updateHospital( HospitalDto hospitalDto);
	    void deleteHospital(int hospitalId);
	    List<Hospital> findByCategory(String category);
	    List<Hospital> findByLocation(String location);
	    List<Hospital> findHospitalsByDoctorName(String doctorName);

	    List<Hospital> findHospitalsBySpeciality(Speciality speciality);

	  
	    List<Hospital> findHospitalsWithExperiencedDoctors(int years);

	}



