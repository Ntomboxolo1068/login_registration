package com.example.demo.web.dto;

public class StudentRegistrationDto {
	
	private String student_name;
	private String student_address;
	private String student_email;
	private String student_password;
	private String course_name;
	
	public StudentRegistrationDto() {}
	
	

	public StudentRegistrationDto(String student_name, String student_address, String student_email,
			String student_password, String course_name) {
		super();
		this.student_name = student_name;
		this.student_address = student_address;
		this.student_email = student_email;
		this.student_password = student_password;
		this.course_name = course_name;
	}



	public String getStudent_name() {
		return student_name;
	}

	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}

	public String getStudent_address() {
		return student_address;
	}

	public void setStudent_address(String student_address) {
		this.student_address = student_address;
	}

	public String getStudent_email() {
		return student_email;
	}

	public void setStudent_email(String student_email) {
		this.student_email = student_email;
	}

	public String getStudent_password() {
		return student_password;
	}

	public void setStudent_password(String student_password) {
		this.student_password = student_password;
	}

	public String getCourse_name() {
		return course_name;
	}

	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}

	
}
