package com.school.management.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.school.management.data.Student;
import com.school.management.repository.StudentRepository;

@Service
public class StudentService {
	@Autowired
	private StudentRepository studentRepository;
	
	public boolean add(Student student) {
		if( studentRepository.findById(student.getUsn()).isEmpty() ) {
			studentRepository.save(student);
			return true;
		}
		return false;
	}

	public Student getStudent(String usn) {
		return studentRepository.findById(usn).orElse(null);
	}

	public List<Student> getStudents() {
		return studentRepository.findAll();
	}
	
	public String updateStudent(String usn, Student student) {
		if( studentRepository.findById(usn).isPresent() ) {
			studentRepository.save(student);
			return "Updated";
		}
		return "Invalid USN";
	}

	public String deleteStudent(String usn) {
		if( studentRepository.findById(usn).isPresent() ) {
			studentRepository.deleteById(usn);
			return "Deleted";
		}
		return "Invalid USN";
	}
}