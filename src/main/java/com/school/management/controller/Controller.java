package com.school.management.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.school.management.data.Student;
import com.school.management.service.StudentService;

@RestController
public class Controller {
	@Autowired
	private StudentService studentService;
	
	@PostMapping("/add")
	public String addStudent(@RequestBody Student student) {
		boolean status = studentService.add(student);
		if(status)
			return student.getUsn() + " is Added";
		return "Student already exists";
	}
	
	@GetMapping("/{usn}")
	public Student getStudent(@PathVariable String usn) {
		return studentService.getStudent(usn);
	}
	
	@GetMapping("/students")
	public List<Student> getStudents() {
		return studentService.getStudents();
	}
	
	@PutMapping("/{usn}")
	public String getStudent(@PathVariable String usn, @RequestBody Student student) {
		return studentService.updateStudent(usn, student);
	}
	
	@DeleteMapping("/{usn}")
	public String deleteStudent(@PathVariable String usn) {
		return studentService.deleteStudent(usn);
	}
}
