package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Student;
import java.util.List;

public interface StudentRepo extends CrudRepository<Student, Long>{

List<Student> findByStudent_name(String student_name);
}
