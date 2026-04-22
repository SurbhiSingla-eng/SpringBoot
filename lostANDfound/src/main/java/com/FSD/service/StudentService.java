package com.FSD.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.FSD.model.Student;

@Service
public class StudentService {
	private final Map<String, Student> store = new HashMap<>();
	
	public Student create(Student student) {
		String id = UUID.randomUUID().toString();
		student.setId(id);
		store.put(id, student);
		return student;
	}
	
	public Collection<Student> findAll() {
		return store.values();
	}
	
	public Student findById(String id) {
		return store.get(id);
	}
	
	public boolean delete(String id) {
		return store.remove(id) != null;
	}
}
