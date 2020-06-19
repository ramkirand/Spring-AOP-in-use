package com.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.annotation.TrackeExecutionTime;
import com.entity.Student;
import com.repository.StudentRepository;

@Component
public class StudentServiceImpl implements StudentService {
	@Autowired
	StudentRepository studentRepository;

	@PostConstruct
	public void initDB() {
		List<Student> students = new ArrayList<>();
		for (int i = 0; i < 50; i++) {
			students.add(new Student(i, "Student_"+ i + new Random().nextInt(5000), i + new Random().nextInt(15)));
		}
		studentRepository.saveAll(students);
	}

	@TrackeExecutionTime
	public List<Student> findAllStudents() {
		return studentRepository.findAll();
	}

}
