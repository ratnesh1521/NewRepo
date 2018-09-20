package com.ratnesh.daos;

import com.ratnesh.dtos.StudentTo;

public interface StudentDao {

	public String insert(StudentTo sto);
	public StudentTo search(String sid);
	public StudentTo getStudent(String sid);
	public String update(StudentTo sid);
	public String delete(String sid);
}
