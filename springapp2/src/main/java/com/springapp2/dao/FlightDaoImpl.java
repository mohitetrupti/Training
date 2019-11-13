package com.springapp2.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.springapp2.dao.StudentDaoImpl.StudentMapper;
import com.springapp2.model.Flight;
import com.springapp2.model.Student;

@Repository("flightDao")
public class FlightDaoImpl implements FlightDaoIntf {

	
	@Autowired
	private JdbcTemplate  jdbctemplateobject;
	
public List<Flight> getAll() {
		
		List<Flight> list = null;
		
		String sql = "select * from Flight";
		list = jdbctemplateobject.query(sql, new FlightMapper());
		
		return list;
	}

	class FlightMapper implements RowMapper<Flight> {
	
		public Flight mapRow(ResultSet rs, int rowNum) throws SQLException {
		
			Flight f = new Flight();
			f.setFlightid(rs.getString(1));
			f.setAirline(rs.getString(2));
			f.setSource(rs.getString(3));
			f.setDestination(rs.getString(4));
			return f;
		
	}
}
	
	public List<Flight> getFlight(String source) {
		
		List<Flight> list = null;
		
		String sql = "select * from Flight where source=?";
		list = jdbctemplateobject.query(sql,new Object[] {source}, new FlightSourceMapper());
		
		return list;
	}
	
	class FlightSourceMapper implements RowMapper<Flight> {
		
		public Flight mapRow(ResultSet rs, int rowNum) throws SQLException {
			
			Flight f = new Flight();
			f.setFlightid(rs.getString(1));
			f.setAirline(rs.getString(2));
			f.setSource(rs.getString(3));
			f.setDestination(rs.getString(4));
			return f;
		}
	}
}
