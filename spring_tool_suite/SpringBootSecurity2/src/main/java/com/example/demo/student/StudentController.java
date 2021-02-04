package com.example.demo.student;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/students")
public class StudentController {
	
	public static final List<Student> STUDENT = Arrays.asList(
			new Student(1, "Revs"),
			new Student(2, "Srinu"),
			new Student(3, "Naveen")
			);
			
	@GetMapping(path = "{studentId}")
	public Student getStudent(@PathVariable Integer studentId) {
		return STUDENT.stream()
					.filter(student -> student.getStudentId().equals(studentId))
					.findFirst()
					.orElseThrow(null);
	}
	
	
}
