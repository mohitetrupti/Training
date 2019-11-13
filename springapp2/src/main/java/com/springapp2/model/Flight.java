package com.springapp2.model;

import java.util.ArrayList;
import java.util.List;

public class Flight {
	private String flightid;
	private String airline;
	private String source;
	private String destination;
	
	//private List<Booking> bookinglist= new ArrayList<Booking>();
	
	public Flight(String flightid, String airline, String source, String destination, List<Booking> bookinglist) {
		super();
		this.flightid = flightid;
		this.airline = airline;
		this.source = source;
		this.destination = destination;
		//this.bookinglist = bookinglist;
	}
	public String getFlightid() {
		return flightid;
	}
	public void setFlightid(String flightid) {
		this.flightid = flightid;
	}
	public String getAirline() {
		return airline;
	}
	public void setAirline(String airline) {
		this.airline = airline;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	
	
	/*public List<Booking> getBookinglist() {
		return bookinglist;
	}
	public void setBookinglist(List<Booking> bookinglist) {
		this.bookinglist = bookinglist;
	}*/
	public Flight() {
		super();
	}
	@Override
	public String toString() {
		return "Flight [flightid=" + flightid + ", airline=" + airline + ", source=" + source + ", destination="
				+ destination + "]";
	}
	
	

}
