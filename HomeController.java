package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Student;
import com.app.service.StudentService;

@RestController
@CrossOrigin("*")
public class HomeController {
	@Autowired
	private StudentService studService;
	
	@PostMapping(value = "register")
	public String registerStudent(@RequestBody Student student) {
		System.out.println("Student Registration works");
		studService.saveStudent(student);
		return "Hi"+ student.getName()+ "your registration process successfully completed";
	}
	@PutMapping(value = "update")
	public Student updateStudent(@RequestBody Student student) {
		System.out.println("Student Update works");
		studService.updateStudent(student);
		return student;
	}
	@GetMapping(value = "getAllUsers")
	public List<Student> findAllStudent() {
		return studService.findAllStudents();
	}
	@GetMapping(value = "findUser/id")
	public Student registerStudent(@RequestParam int id) {
		return studService.findStudentById(id);
	}
	@DeleteMapping(value = "cancel/id")
	public List<Student> deleteStudent(@RequestParam int id) {
		studService.deleteStudent(id);
		return studService.findAllStudents();
	}
}
