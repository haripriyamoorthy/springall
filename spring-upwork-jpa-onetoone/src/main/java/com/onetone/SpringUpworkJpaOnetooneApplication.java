package com.onetone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.onetone.Service.IJobService;
import com.onetone.model.FeatureDto;
import com.onetone.model.JobDto;
import com.onetone.model.JobType;
import com.onetone.model.Mode;
import com.onetone.model.Role;

@SpringBootApplication
public class SpringUpworkJpaOnetooneApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringUpworkJpaOnetooneApplication.class, args);
	}
	@Autowired
	private IJobService jobService;
	@Override
	public void run(String... args) throws Exception {
		FeatureDto featureDto=new FeatureDto(null,Mode.ONLINE.name(),JobType.FULLTIME.name(),"This is a developer job",Role.CONTRACT.name());
		JobDto jobDto=new JobDto(null,"12:15",23000,"Goa",featureDto);
		
		jobService.addjob(jobDto);
		
		
		
		
		JobDto njobDto=jobService.getById(51);
		njobDto.setLocation("mysore");
		jobService.updateJob(njobDto);
		
		
		
		jobService.getAll().forEach(System.out::println);
		
		
		System.out.println();
		System.out.println("Get job by Role");
		jobService.getByRole(Role.CONTRACT.name()).forEach(System.out::println);
		
		System.out.println();
		System.out.println("Get job by Location");
		jobService.getByLocation("Goa").forEach(System.out::println);
		
		
		System.out.println();
		System.out.println(" get job By Type and Mode");
		jobService.getByTypeandMode(JobType.FULLTIME.name(),Mode.ONLINE.name()).forEach(System.out::println);
		
		
		
	}

}