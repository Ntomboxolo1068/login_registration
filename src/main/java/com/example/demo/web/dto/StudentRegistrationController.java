package com.example.demo.web.dto;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.service.StudentService;

//Backend part for registration
@Controller
@RequestMapping("/registration")

@Configuration
public class StudentRegistrationController {
	

	private StudentService studentService;
	
	public StudentRegistrationController(StudentService studentService) {
		super();
		this.studentService = studentService;
	}
	

	@ModelAttribute("student")
	public StudentRegistrationDto studentRegistrationDto() {
		return new StudentRegistrationDto();
	}
		
	@GetMapping
	public String showRegistrationForm() {
	   
	    return "registration";
	}
	
	

@PostMapping
public String registrationStudentAccount(@ModelAttribute("student")StudentRegistrationDto registrationDto)
{		studentService.save(registrationDto);
		return "redirect:/registration?success";
	
}


}
