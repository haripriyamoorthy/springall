package com.onetone.Service;

import java.util.List;

import com.onetone.model.JobDto;


public interface IJobService {
    void addjob(JobDto jobDTO);
    void updateJob(JobDto jobDTO);
    
    
    List<JobDto> getAll();
	
	
	
	
	
	
	List<JobDto> getByRole(String role);
	List<JobDto> getByTypeandMode(String jobType, String mode);
	List<JobDto> getByLocation(String location);
	JobDto getById(Integer JobId);
	void deleteJob(Integer JobId);
}
