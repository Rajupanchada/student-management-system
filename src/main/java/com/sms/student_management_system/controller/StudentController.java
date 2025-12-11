package com.sms.student_management_system.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.sms.student_management_system.entity.Student;
import com.sms.student_management_system.repo.StudentRepo;



@Controller
public class StudentController {

	
	@Autowired
	private StudentRepo studentRepo;
	
	//Main Page - Landing Page
	@GetMapping(value = "/") 
	public String landingPage() {
		return "index";
	}
	
	
	//Student Details Page - Shows all students
	@GetMapping(value = "/studentDetails")
	public String homePage(Model model) {
		model.addAttribute("studentlist", studentRepo.findAll());
		return "home";
	}
	
	@GetMapping(value = "/saveStudentPage")
	public String saveStudentPage(Model model) {
		Student student = new Student();
		model.addAttribute("student", student);
		return "add_student";
	}
	
	//applied changes here
	@PostMapping(value = "/saveStudent")
	public String saveStudent(@ModelAttribute("student") Student student) {
		studentRepo.save(student);
		return "redirect:/studentDetails";
	}
	

	
	@GetMapping(value = "/updateStudentPage/{id}")
	public String showUpdateStudentPage(@PathVariable("id") int id, Model model) {
		Student student = studentRepo.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid student Id:" + id));
		model.addAttribute("student", student);
		return "update_student";
	}
	
	//applied changes here
	@GetMapping(value = "/deleteStudent/{id}")
	public String deleteStudent(@PathVariable("id") int id) {
		studentRepo.deleteById(id);
		return "redirect:/studentDetails";
		
	}

}
