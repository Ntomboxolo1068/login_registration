package com.example.demo.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table (name = "students", uniqueConstraints = @UniqueConstraint(columnNames = "student_email") )


public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "student_name",nullable = false, length = 40)
	private String student_name;
	
	@Column(name = "student_address",nullable = false,length = 40)
	private String student_address;
	
	@Column(nullable = false, unique = true, length = 40)
	private String student_email;
	
	@Column(nullable = false,length = 64)
	

	private String student_password;
	
	@Column(nullable = false,length = 64)
	private String course_name;


	 public Student(String student_name, String student_address, String student_email, String student_password,
			String course_name) {
		super();
		this.student_name = student_name;
		this.student_address = student_address;
		this.student_email = student_email;
		this.student_password = student_password;
		this.course_name = course_name;
	}
	public Student() {
		
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
