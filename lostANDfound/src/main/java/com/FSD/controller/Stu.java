package com.FSD.controller;

import java.util.Collection;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.FSD.model.Student;
import com.FSD.service.StudentService;

@RestController
@RequestMapping("Student")
public class Stu {
	
	private StudentService service;
	
	public Stu (StudentService service) {
		this.service = service;
	}
	
	@GetMapping("/check")
	public String check() {
		return "this is checking";
	}
	
	@GetMapping("/student")
	public Collection<Student> getAll() {
		return service.findAll();
	}
	
	@PostMapping("/newStudent")
	public Student addStudent(@RequestBody Student student) {
		return service.create(student);
	}
	
	@GetMapping("/{id}")
	public Student findById(@PathVariable String id) {
		return service.findById(id);
	}
	
	@DeleteMapping("/{id}")
	public boolean deleteStudent(@PathVariable String id) {
	    return service.delete(id);
	}
}
