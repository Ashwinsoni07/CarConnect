package com.Model;

public class Vehicle {
	  private int vehicle_id	;	
	  private String vehicle_model;		
	  private String vehicle_make;			
	  private int vehicle_year;		
	  private String vehicle_color;			
	  private String vehicle_registration_no;			
	  private  boolean vehicle_availability;	
	  private double vehicle_daily_rate;
	  private int vendor_id;
	  
	  /*Getters and Setters for variables*/
	public int getVehicle_id() {
		return vehicle_id;
	}
	public void setVehicle_id(int vehicle_id) {
		this.vehicle_id = vehicle_id;
	}
	public String getVehicle_model() {
		return vehicle_model;
	}
	public void setVehicle_model(String vehicle_model) {
		this.vehicle_model = vehicle_model;
	}
	public String getVehicle_make() {
		return vehicle_make;
	}
	public void setVehicle_make(String vehicle_make) {
		this.vehicle_make = vehicle_make;
	}
	public int getVehicle_year() {
		return vehicle_year;
	}
	public void setVehicle_year(int vehicle_year) {
		this.vehicle_year = vehicle_year;
	}
	public String getVehicle_color() {
		return vehicle_color;
	}
	public void setVehicle_color(String vehicle_color) {
		this.vehicle_color = vehicle_color;
	}
	public String getVehicle_registration_no() {
		return vehicle_registration_no;
	}
	public void setVehicle_registration_no(String vehicle_registration_no) {
		this.vehicle_registration_no = vehicle_registration_no;
	}
	public boolean isVehicle_availability() {
		return vehicle_availability;
	}
	public void setVehicle_availability(boolean vehicle_availability) {
		this.vehicle_availability = vehicle_availability;
	}
	public double getVehicle_daily_rate() {
		return vehicle_daily_rate;
	}
	public void setVehicle_daily_rate(double vehicle_daily_rate) {
		this.vehicle_daily_rate = vehicle_daily_rate;
	}
	public int getVendor_id() {
		return vendor_id;
	}
	public void setVendor_id(int vendor_id) {
		this.vendor_id = vendor_id;
	}
	
	/*Overrided the toString method*/
	@Override
	public String toString() {
		return "Vehicle [vehicle_id=" + vehicle_id + ", vehicle_model=" + vehicle_model + ", vehicle_make="
				+ vehicle_make + ", vehicle_year=" + vehicle_year + ", vehicle_color=" + vehicle_color
				+ ", vehicle_registration_no=" + vehicle_registration_no + ", vehicle_availability="
				+ vehicle_availability + ", vehicle_daily_rate=" + vehicle_daily_rate + ", vendor_id=" + vendor_id
				+ "]";
	}
	
	/*constructor*/
	public Vehicle(int vehicle_id, String vehicle_model, String vehicle_make, int vehicle_year, String vehicle_color,
			String vehicle_registration_no, boolean vehicle_availability, double vehicle_daily_rate, int vendor_id) {
		
		this.vehicle_id = vehicle_id;
		this.vehicle_model = vehicle_model;
		this.vehicle_make = vehicle_make;
		this.vehicle_year = vehicle_year;
		this.vehicle_color = vehicle_color;
		this.vehicle_registration_no = vehicle_registration_no;
		this.vehicle_availability = vehicle_availability;
		this.vehicle_daily_rate = vehicle_daily_rate;
		this.vendor_id = vendor_id;
	}
	  
	public Vehicle() {
		
	}
}