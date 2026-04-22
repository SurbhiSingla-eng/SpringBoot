package com.FSD.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Student {
	@JsonProperty(access=JsonProperty.Access.READ_WRITE)
	private String name;
	private int semester;
	private List<String> courses;
	private String rollNo;
	private String id;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSemester() {
		return semester;
	}
	public void setSemester(int semester) {
		this.semester = semester;
	}
	public List<String> getCourses() {
		return courses;
	}
	public void setCourses(List<String> courses) {
		this.courses = courses;
	}
	public String getRollNo() {
		return rollNo;
	}
	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
}
