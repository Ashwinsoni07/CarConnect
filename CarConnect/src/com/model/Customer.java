package com.model;

import java.util.Date;

public class Customer {
	private int customerId;
	private String customerFirstName;
	private String customerLastName;
	private String customerEmail;
	private String customerPhoneNumber;
	private Date customerRegistrationDate;
	private int userId;
	private int addressId;
		
	public Customer() {

	}
	
	public Customer(int customerId, String customerFirstName, String customerLastName, String customerEmail,
			String customerPhoneNumber, Date customerRegistrationDate, int userId, int addressId) {
		super();
		this.customerId = customerId;
		this.customerFirstName = customerFirstName;
		this.customerLastName = customerLastName;
		this.customerEmail = customerEmail;
		this.customerPhoneNumber = customerPhoneNumber;
		this.customerRegistrationDate = customerRegistrationDate;
		this.userId = userId;
		this.addressId = addressId;
	}
	
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerFirstName() {
		return customerFirstName;
	}
	public void setCustomerFirstName(String customerFirstName) {
		this.customerFirstName = customerFirstName;
	}
	public String getCustomerLastName() {
		return customerLastName;
	}
	public void setCustomerLastName(String customerLastName) {
		this.customerLastName = customerLastName;
	}
	public String getCustomerEmail() {
		return customerEmail;
	}
	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}
	public String getCustomerPhoneNumber() {
		return customerPhoneNumber;
	}
	public void setCustomerPhoneNumber(String customerPhoneNumber) {
		this.customerPhoneNumber = customerPhoneNumber;
	}
	public Date getCustomerRegistrationDate() {
		return customerRegistrationDate;
	}
	public void setCustomerRegistrationDate(Date customerRegistrationDate) {
		this.customerRegistrationDate = customerRegistrationDate;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerFirstName=" + customerFirstName + ", customerLastName="
				+ customerLastName + ", customerEmail=" + customerEmail + ", customerPhoneNumber=" + customerPhoneNumber
				+ ", customerRegistrationDate=" + customerRegistrationDate + ", userId=" + userId + ", addressId="
				+ addressId + "]";
	}
}
