package com.springapp2.dao;

import java.util.List;

import com.springapp2.model.Flight;

public interface FlightDaoIntf {

	public List<Flight> getAll();
	public List<Flight> getFlight(String source);
}
