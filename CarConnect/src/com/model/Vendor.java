package com.model;

import java.util.Date;

public class Vendor {
	private int vendor_id;
	private String vendor_first_name;
	private String vendor_last_name;
	private String vendor_email;
	private String vendor_phone_number;
	private Date vendor_registration_date;
	private int user_id;
	private int address_id;
	
	//Constructor
	public Vendor(int vendor_id, String vendor_first_name, String vendor_last_name, String vendor_email,
			String vendor_phone_number, Date vendor_registration_date, int user_id, int address_id) {
		super();
		this.vendor_id = vendor_id;
		this.vendor_first_name = vendor_first_name;
		this.vendor_last_name = vendor_last_name;
		this.vendor_email = vendor_email;
		this.vendor_phone_number = vendor_phone_number;
		this.vendor_registration_date = vendor_registration_date;
		this.user_id = user_id;
		this.address_id = address_id;
	}

	public Vendor() {
		super();
		// TODO Auto-generated constructor stub
	}

	//Getters and Setters
	public int getVendor_id() {
		return vendor_id;
	}

	public void setVendor_id(int vendor_id) {
		this.vendor_id = vendor_id;
	}

	public String getVendor_first_name() {
		return vendor_first_name;
	}

	public void setVendor_first_name(String vendor_first_name) {
		this.vendor_first_name = vendor_first_name;
	}

	public String getVendor_last_name() {
		return vendor_last_name;
	}

	public void setVendor_last_name(String vendor_last_name) {
		this.vendor_last_name = vendor_last_name;
	}

	public String getVendor_email() {
		return vendor_email;
	}

	public void setVendor_email(String vendor_email) {
		this.vendor_email = vendor_email;
	}

	public String getVendor_phone_number() {
		return vendor_phone_number;
	}

	public void setVendor_phone_number(String vendor_phone_number) {
		this.vendor_phone_number = vendor_phone_number;
	}

	public Date getVendor_registration_date() {
		return vendor_registration_date;
	}

	public void setVendor_registration_date(Date vendor_registration_date) {
		this.vendor_registration_date = vendor_registration_date;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public int getAddress_id() {
		return address_id;
	}

	public void setAddress_id(int address_id) {
		this.address_id = address_id;
	}

	@Override
	public String toString() {
		return "Vendor [vendor_id=" + vendor_id + ", vendor_first_name=" + vendor_first_name + ", vendor_last_name="
				+ vendor_last_name + ", vendor_email=" + vendor_email + ", vendor_phone_number=" + vendor_phone_number
				+ ", vendor_registration_date=" + vendor_registration_date + ", user_id=" + user_id + ", address_id="
				+ address_id + "]";
	}
	
	
	
}
