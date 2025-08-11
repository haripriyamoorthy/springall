package com.onetone.Repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.onetone.model.Features;
import com.onetone.model.Job;

import java.util.List;
@Repository
public interface IJobRepository extends JpaRepository<Job, Integer> {

// 1. Get jobs by jobType and mode
	@Query("from Job j inner join j.features f  where f.jobType= :fjobtype and f.mode= :fmode")
	List<Job> findByTypeMode(@Param("fjobtype") String jobType, @Param("fmode") String mode);


// 2. Get jobs by role
	@Query("from Job j inner join j.features f where f.role=?1")
	List<Job> findByRole(@Param("frole")String role);


// 3. Get jobs by location
List<Job> findByLocation(String location);

}



