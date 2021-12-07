package com.app.service;

import java.util.List;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.StudentRepository;
import com.app.model.Student;

@Service
public class StudentService {
	@Autowired
	private StudentRepository studRepo;
	
	public Student saveStudent(Student student) {
		return studRepo.save(student);
	}
	public Student updateStudent(Student student) {
		return studRepo.save(student);
	}
	public List<Student> findAllStudents() {
		return (List<Student>) studRepo.findAll();
	}
	public Student findStudentById(int id) {
		return studRepo.findById(id).get();
	}
	public void deleteStudent(int id) {
		studRepo.deleteById(id);	
	}
}
