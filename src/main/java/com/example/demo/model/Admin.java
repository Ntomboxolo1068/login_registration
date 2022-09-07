package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "admin" )
public class Admin {

 @Id
 @GeneratedValue(strategy = GenerationType.AUTO)
Long id;
 
 @Column(nullable = false, length = 45)
String admin_name;
 
 @Column(nullable = false, unique = true, length = 45)
String admin_password;
 
 public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getAdmin_name() {
	return admin_name;
}

public Admin() {
	
}

public void setAdmin_name(String admin_name) {
	this.admin_name = admin_name;
}

public String getAdmin_password() {
	return admin_password;
}

public void setAdmin_password(String admin_password) {
	this.admin_password = admin_password;
}

public String getAdmin_contact() {
	return admin_contact;
}

public void setAdmin_contact(String admin_contact) {
	this.admin_contact = admin_contact;
}

@Column(nullable = false, length = 45)
String admin_contact;
}
