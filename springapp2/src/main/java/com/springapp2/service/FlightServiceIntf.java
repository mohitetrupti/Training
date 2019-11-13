package com.springapp2.service;

import java.util.List;

import com.springapp2.model.Flight;

public interface FlightServiceIntf {

	public List<Flight> getAll();
	public List<Flight> getFlight(String source);
}
