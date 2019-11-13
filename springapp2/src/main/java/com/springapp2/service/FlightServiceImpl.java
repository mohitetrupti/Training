package com.springapp2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springapp2.dao.FlightDaoIntf;
import com.springapp2.model.Flight;
import com.springapp2.model.Student;

@Service("flightService")
public class FlightServiceImpl implements FlightServiceIntf {

	@Autowired
	FlightDaoIntf flightDao;
	
	public List<Flight> getAll() {
		
		List<Flight> list = flightDao.getAll();
		return list;
	}
	public List<Flight> getFlight(String source) {
		
		List<Flight> list = flightDao.getFlight(source);
		return list;
	}
}
