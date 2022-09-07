package com.example.demo.service;

import com.example.demo.model.Student;
import com.example.demo.web.dto.StudentRegistrationDto;

import java.util.List;

 


public interface StudentService {
	
	Student save(StudentRegistrationDto registrationDto);
	
	List<Student> getAllStudents();
	
	Student saveStudent(Student student);
	
	Student getStudentById(Long id);
	
	Student updateStudent(Student student);
	
	void deleteStudentById(Long id);

	
}
