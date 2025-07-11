package com.studentapp.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.studentapp.model.Student;

@Repository
public interface IStudentRepository extends JpaRepository<Student, Integer>{
	//derived query
	List<Student> findByDepartment(String department);
  
	List<Student> findByAddressCity(String city);
	//custom query 
	@Query("from Student s inner join s.address a where a.state=?1")
	List<Student> findByState(String state);

}