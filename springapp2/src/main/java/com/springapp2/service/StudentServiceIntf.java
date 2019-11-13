package com.springapp2.service;

import java.util.List;

import com.springapp2.model.Student;

public interface StudentServiceIntf {

	public boolean createStudent(Student student);
	public Student getStudent(String id);
	public List<Student> getAll();
}
