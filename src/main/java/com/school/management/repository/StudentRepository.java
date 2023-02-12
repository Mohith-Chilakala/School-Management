package com.school.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.school.management.data.Student;

public interface StudentRepository extends JpaRepository<Student, String>{}
