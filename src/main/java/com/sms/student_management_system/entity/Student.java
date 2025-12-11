package com.sms.student_management_system.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "students")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private int id;
	private String name;
	private String email;
	private String course;
	private int age;
	private String address;
	public Student(String name, String email, String course, int age, String address) {
		super();
		this.name = name;
		this.email = email;
		this.course = course;
		this.age = age;
		this.address = address;
	}
	
	

}
