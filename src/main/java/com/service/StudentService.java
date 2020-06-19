package com.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.entity.Student;

@Service
public interface StudentService {
	public List<Student> findAllStudents();
}
