package com.springapp2.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.springapp2.model.Student;

@Repository("studentDao")
public class StudentDaoImpl implements StudentDaoIntf {
	
	@Autowired
	private JdbcTemplate  jdbctemplateobject;
	public boolean createStudent(Student student) {
		String sql = "INSERT into students(id,name,grade) values(?,?,?)";
		int result = jdbctemplateobject.update(sql,new Object[]{student.getId(),student.getName(),student.getGrade()});
		if(result>0){
			System.out.println("Added: "+student);
			return true;
		}
		else{
			System.out.println("Not Added");
			return false;
		}
		
		
	}
	public Student getStudent(String id) {
		
		String sql = "Select * from students where id=?";
		Student st =jdbctemplateobject.query(sql,new Object[]{id}, 
							new ResultSetExtractor<Student>(){
	public Student extractData(ResultSet rs) throws SQLException, DataAccessException {
		
		Student s = null;
		if(rs.next()){
			s = new Student();
			s.setId(rs.getString(1));
			s.setName(rs.getString(2));
			s.setGrade(rs.getString(3));
				
		}
		return s;
		}	
		});
		return st;
	}
	public List<Student> getAll() {
		
		List<Student> list = null;
		
		String sql = "select * from students";
		list = jdbctemplateobject.query(sql, new StudentMapper());
		
		return list;
	}
	
	class StudentMapper implements RowMapper<Student> {
		
		public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
			
			Student s = new Student();
			s.setId(rs.getString(1));
			s.setName(rs.getString(2));
			s.setGrade(rs.getString(3));
			return s;
			
		}
	}
}
