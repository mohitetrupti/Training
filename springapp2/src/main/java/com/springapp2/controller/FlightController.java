package com.springapp2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.springapp2.model.Flight;
import com.springapp2.model.Student;
import com.springapp2.service.FlightServiceIntf;
import com.springapp2.service.StudentServiceIntf;

@Controller("flightController")
public class FlightController {

	@Autowired
	FlightServiceIntf flightService;
	
	public List<Flight> getAll() {
		
		List<Flight> list = flightService.getAll();
		return list;
	}
	
	public List<Flight> getFlight() {
		
		List<Flight> list = flightService.getFlight("Pune");
		return list;
	}
}
