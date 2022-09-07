package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;
import com.example.demo.web.dto.StudentRegistrationDto;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
	
	private StudentRepository studentRepository;
	

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;
	
	public StudentServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}

	@Override
	public Student save(StudentRegistrationDto registrationDto) {
		
	Student student = new Student(registrationDto.getStudent_name(),
			registrationDto.getStudent_address(),
			registrationDto.getStudent_email(), registrationDto.getCourse_name(), registrationDto.getStudent_password());
		
	//Encrypt password using spring security
	student.setStudent_password(passwordEncoder.encode(registrationDto.getStudent_password()));
		
		return studentRepository.save(student);
	}
	
	@Override
	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}

	@Override
	public Student saveStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public Student getStudentById(Long id) {
		return studentRepository.findById(id).get();
	}

	@Override
	public Student updateStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public void deleteStudentById(Long id) {
		studentRepository.deleteById(id);	
	}



}
