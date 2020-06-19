package com.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entity.Student;
import com.service.StudentService;

@RestController
public class StudentController {
	@Autowired
	StudentService studentService;

	@GetMapping("/")
	public List<Student> getStudents() {
		return studentService.findAllStudents();
	}
}
