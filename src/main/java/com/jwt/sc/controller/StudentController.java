package com.jwt.sc.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jwt.sc.model.Student;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class StudentController {
	
	
	List<Student> students =new ArrayList<>(Arrays.asList(new Student("chai", 1, "12"),new Student("coffee", 2, "15")));
	
	@GetMapping("/student")
	public List<Student> getStudent(){
		return students;
	}
	
	@GetMapping("/getCsrfToken")
	public CsrfToken getCsrfToken(HttpServletRequest httpServletRequest) {
		return (CsrfToken) httpServletRequest.getAttribute("_csrf");
	}
	
	@PostMapping("/student")
	public Student addStudent(@RequestBody Student student) {
		students.add(student);
		return student;
	}

}
