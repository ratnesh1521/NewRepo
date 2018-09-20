package com.ratnesh.services;

import com.ratnesh.dtos.StudentTo;

public interface StudentService {
	public String add(StudentTo sto);
	public StudentTo search(String sid);
	public StudentTo getStudent(String sid);
	public String update(StudentTo std);
	public String delete(String sid);
}