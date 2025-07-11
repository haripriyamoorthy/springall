package com.studentapp.Service;






import com.studentapp.Repository.IStudentRepository;
import com.studentapp.model.Student;
import com.studentapp.model.Studentdto;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class StudentServiceImpl implements IStudentService {

    @Autowired
    private IStudentRepository StudentRepository;
    
    @Autowired
	private ModelMapper mapper;
	
	//autowire IProductRepository

	

	public  StudentServiceImpl(IStudentRepository StudentRepository) {
		super();
		this.StudentRepository = StudentRepository;
	}


	@Override
	public void addStudent(Studentdto studentdto) {
	
        
        Student student = mapper.map(studentdto, Student.class);
		//save the entity
		// check for id - 
//		if no, autogenerate the id, create a new row
//		if yes, check if id is in database, 
//		 if no, create a new row, if yes update the row
        StudentRepository.save(student);
		
	}

	

	@Override
	public void updateStudent(Studentdto studentdto) {
		// TODO Auto-generated method stub
		Student student = mapper.map(studentdto, Student.class);
		//save the entity
		// check for id - 
//		if no, autogenerate the id, create a new row
//		if yes, check if id is in database, 
//		 if no, create a new row, if yes update the row
        StudentRepository.save(student);
		
	}

	@Override
	public void deleteStudent(int studentId) {
		// TODO Auto-generated method stub
		StudentRepository.deleteById(studentId);
	}

	@Override
	public Studentdto getById(int studentId) {
		// TODO Auto-generated method stub
		
		Optional<Student> studentOpt =  StudentRepository.findById(studentId);
		//check if opt is having value product entity
		if(studentOpt.isPresent()) {
			// this returns the product entity
			Student student = studentOpt.get();
			//convert the entity into productDto object
			Studentdto StudentDTO =mapper.map(student, Studentdto.class);
			return StudentDTO;
		}
		return null;
	}

	@Override
	public List<Studentdto> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

    
}

