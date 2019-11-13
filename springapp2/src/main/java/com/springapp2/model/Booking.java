package com.springapp2.model;

//@Entity

public class Booking {
	
	
	private int bookingid;
	private String pname;
	private String page; 
	private Flight flight;
	public Booking(int bookingid, String pname, String page, Flight flight) {
		super();
		this.bookingid = bookingid;
		this.pname = pname;
		this.page = page;
		this.flight = flight;
	}
	public int getBookingid() {
		return bookingid;
	}
	public void setBookingid(int bookingid) {
		this.bookingid = bookingid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPage() {
		return page;
	}
	public void setPage(String page) {
		this.page = page;
	}
	public Flight getFlight() {
		return flight;
	}
	public void setFlight(Flight flight) {
		this.flight = flight;
	}
	public Booking() {
		super();
	}
	@Override
	public String toString() {
		return "Booking [bookingid=" + bookingid + ", pname=" + pname + ", page=" + page + ", flight=" + flight + "]";
	}
	
	

}
