package com.sms.student_management_system;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sms.student_management_system.entity.Student;
import com.sms.student_management_system.repo.StudentRepo;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

	@Autowired
	private StudentRepo studentRepo;
	
	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Student s1=new Student("Raju Panchada", "rajubabupanchada868@gmail.com", "Java Full Stack", 21, "Sr Nagar");
	    Student s2=new Student("Vamsi Reddy", "vamsireddy@gmail.com", "Data Analysis", 21, "Kphb");
	    Student s3=new Student("Naidu Poluparthi", "naidupoluparthi@gmail.com", "Full Stack Java Developer", 22, "Sr Nagar");
	    Student s4=new Student("Seshu Velagala", "seshuvelagala@gmail.com", "Web Development", 24, "Kukatpally");
	    Student s5=new Student("Durga Prasad Marisa", "durgaprasadmarisa@gmail.com", "Python Developer", 23, "Hi-Tech City");
	    Student s6=new Student("Naga Sai Devarapu", "flashman@gmail.com", "Data Science", 25, "Kukatpally");
	
	    studentRepo.save(s1);
	    studentRepo.save(s2);
	    studentRepo.save(s3);
	    studentRepo.save(s4);
	    studentRepo.save(s5);
	    studentRepo.save(s6);
	}

}
