package com.springapp2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springapp2.dao.StudentDaoIntf;
import com.springapp2.model.Student;

@Service("studentService")
public class StudentServiceImpl implements StudentServiceIntf {

	@Autowired
	StudentDaoIntf studentDao;
	
	public boolean createStudent(Student student) {
		
		boolean flag = studentDao.createStudent(student);
		return flag;
	}

	public Student getStudent(String id) {
		
		Student st = studentDao.getStudent(id);
		return st;
	}
	public List<Student> getAll() {
		
		List<Student> list = studentDao.getAll();
		return list;
	}
}
