package com.model;

import java.util.Date;

public class Reservation {
	private int customer_id; 
	private int vehicle_id;
	private int reservation_id;
	private Date reservation_start_date;
	private Date reservation_end_date;
	private double reservation_total_cost;
	private String reservation_status;
	private int admin_id;
	
	//Constructor
	public Reservation(int customer_id, int vehicle_id, int reservation_id, Date reservation_start_date,
			Date reservation_end_date, double reservation_total_cost, String reservation_status, int admin_id) {
		super();
		this.customer_id = customer_id;
		this.vehicle_id = vehicle_id;
		this.reservation_id = reservation_id;
		this.reservation_start_date = reservation_start_date;
		this.reservation_end_date = reservation_end_date;
		this.reservation_total_cost = reservation_total_cost;
		this.reservation_status = reservation_status;
		this.admin_id = admin_id;
	}
	
	
	//Constructor for objects
	public Reservation() {
		super();
		// TODO Auto-generated constructor stub
	}


	//Getters and Setters
	public int getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}
	public int getVehicle_id() {
		return vehicle_id;
	}
	public void setVehicle_id(int vehicle_id) {
		this.vehicle_id = vehicle_id;
	}
	public int getReservation_id() {
		return reservation_id;
	}
	public void setReservation_id(int reservation_id) {
		this.reservation_id = reservation_id;
	}
	public Date getReservation_start_date() {
		return reservation_start_date;
	}
	public void setReservation_start_date(Date reservation_start_date) {
		this.reservation_start_date = reservation_start_date;
	}
	public Date getReservation_end_date() {
		return reservation_end_date;
	}
	public void setReservation_end_date(Date reservation_end_date) {
		this.reservation_end_date = reservation_end_date;
	}
	public double getReservation_total_cost() {
		return reservation_total_cost;
	}
	public void setReservation_total_cost(double reservation_total_cost) {
		this.reservation_total_cost = reservation_total_cost;
	}
	public String getReservation_status() {
		return reservation_status;
	}
	public void setReservation_status(String reservation_status) {
		this.reservation_status = reservation_status;
	}
	public int getAdmin_id() {
		return admin_id;
	}
	public void setAdmin_id(int admin_id) {
		this.admin_id = admin_id;
	}

	// ToString
	@Override
	public String toString() {
		return "Reservation [customer_id=" + customer_id + ", vehicle_id=" + vehicle_id + ", reservation_id="
				+ reservation_id + ", reservation_start_date=" + reservation_start_date + ", reservation_end_date="
				+ reservation_end_date + ", reservation_total_cost=" + reservation_total_cost + ", reservation_status="
				+ reservation_status + ", admin_id=" + admin_id + "]";
	}
	
	
	
}
