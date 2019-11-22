package com.niit.miet.shopping_backend.model;
import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Customer implements Serializable 
{
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int customerId;
	private String customerName; 
	
	private int customer_Mobile_No;
	private int customer_Aadhar_No;
	private String customer_Email_Id;	
	
	private String customer_Password;

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getCustomer_Mobile_No() {
		return customer_Mobile_No;
	}

	public void setCustomer_Mobile_No(int customer_Mobile_No) {
		this.customer_Mobile_No = customer_Mobile_No;
	}

	public int getCustomer_Aadhar_No() {
		return customer_Aadhar_No;
	}

	public void setCustomer_Aadhar_No(int customer_Aadhar_No) {
		this.customer_Aadhar_No = customer_Aadhar_No;
	}

	public String getCustomer_Email_Id() {
		return customer_Email_Id;
	}

	public void setCustomer_Email_Id(String customer_Email_Id) {
		this.customer_Email_Id = customer_Email_Id;
	}

	public String getCustomer_Password() {
		return customer_Password;
	}

	public void setCustomer_Password(String customer_Password) {
		this.customer_Password = customer_Password;
	}
	
	
	
	}
