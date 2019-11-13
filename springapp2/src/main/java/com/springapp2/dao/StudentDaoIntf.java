package com.springapp2.dao;

import java.util.List;

import com.springapp2.model.Student;

public interface StudentDaoIntf {

	public boolean createStudent(Student student);
	public Student getStudent(String id);
	public List<Student> getAll();
	 
}
