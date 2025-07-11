package com.studentapp.Service;


import java.util.List;

import com.studentapp.model.Studentdto;

public interface IStudentService {
    void addStudent(Studentdto studentDTO);
    void updateStudent(Studentdto studentDTO);
    void deleteStudent(int studentId);
    Studentdto getById(int studentId);
    List<Studentdto> getAll();
}
