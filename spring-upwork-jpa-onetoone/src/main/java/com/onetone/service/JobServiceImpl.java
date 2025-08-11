package com.onetone.Service;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.onetone.Exceptions.JobNotFoundException;
import com.onetone.Repository.IJobRepository;
import com.onetone.model.Job;
import com.onetone.model.JobDto;
import com.onetone.model.JobDto;

import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
@Service
@RequiredArgsConstructor
public class JobServiceImpl implements IJobService {
	@Autowired
	private final IJobRepository JobRepository;
	@Autowired
	private final ModelMapper mapper;
	@Override
	public void addjob(JobDto jobDTO) {
		// TODO Auto-generated method stub
		Job job =  mapper.map(jobDTO, Job.class);
		JobRepository.save(job);
		
		
	}

	@Override
	public void updateJob(JobDto jobDTO) {
		// TODO Auto-generated method stub
		Job job =  mapper.map(jobDTO, Job.class);
		JobRepository.save(job);
		
		
	}

	@Override
	public void deleteJob(Integer jobId) {
		// TODO Auto-generated method stub
		JobRepository.deleteById(jobId);
		
	}

	@Override
	public JobDto getById(Integer jobId) {
		Job job = JobRepository.findById(jobId).orElseThrow(() -> new JobNotFoundException("invalid id"));
		JobDto jobDto = mapper.map(job, JobDto.class);
		return jobDto;
		
	}

	@Override
	public List<JobDto> getAll() {
		// TODO Auto-generated method stub
		List<Job> job = JobRepository.findAll();
		return job.stream()
				     .map(jobs->mapper.map(jobs,JobDto.class))
				     .toList();
		
	}
	
		

		@Override
		public List<JobDto> getByRole(String role) {
			List<Job> jobs = JobRepository.findByRole(role);
			if (jobs.isEmpty())
				throw new JobNotFoundException("invalid role");
			return jobs.stream().map((job) -> mapper.map(job, JobDto.class)).toList();
		}

		@Override
		public List<JobDto> getByLocation(String location) {
			List<Job> jobs = JobRepository.findByLocation(location);
			if (jobs.isEmpty())
				throw new JobNotFoundException("invalid location");
			return jobs.stream().map((job) -> mapper.map(job, JobDto.class)).toList();
		}

		
		@Override
		public List<JobDto> getByTypeandMode(String jobType, String mode) {
			List<Job> jobs = JobRepository.findByTypeMode(jobType, mode);
			if (jobs.isEmpty())
				throw new JobNotFoundException("invlaid  jobType and mode");
			return jobs.stream().map((job) -> mapper.map(job, JobDto.class)).toList();
		}

	

		
	}

	
	
	



