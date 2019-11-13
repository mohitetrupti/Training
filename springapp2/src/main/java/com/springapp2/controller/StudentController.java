package com.springapp2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.springapp2.model.Student;
import com.springapp2.service.StudentServiceIntf;

@Controller("studentController")
public class StudentController {

	@Autowired
	StudentServiceIntf studentService;
	
	public boolean createStudent() {
		
		Student student = new Student();
		student.setId("102");
		student.setName("Trupti");
		student.setGrade("A");
		boolean flag = studentService.createStudent(student);
		return flag;
	}
	public Student getStudent(){
		
		Student st= studentService.getStudent("101");
		return st;
	}
	
	public List<Student> getAll() {
		
		List<Student> list = studentService.getAll();
		return list;
	}
}
