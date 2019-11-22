package com.niit.miet.shopping_backend.model;
import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity

public class Shipping implements Serializable
{
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	
	private int customerId;
	private String customer_House_No;
	private String customer_Street_Name;
	private String customer_City_Name;
	private String customer_Land_Marked;
	private String customer_State_Name;
	private int customer_Pin_Code;
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomer_House_No() {
		return customer_House_No;
	}
	public void setCustomer_House_No(String customer_House_No) {
		this.customer_House_No = customer_House_No;
	}
	public String getCustomer_Street_Name() {
		return customer_Street_Name;
	}
	public void setCustomer_Street_Name(String customer_Street_Name) {
		this.customer_Street_Name = customer_Street_Name;
	}
	public String getCustomer_City_Name() {
		return customer_City_Name;
	}
	public void setCustomer_City_Name(String customer_City_Name) {
		this.customer_City_Name = customer_City_Name;
	}
	public String getCustomer_Land_Marked() {
		return customer_Land_Marked;
	}
	public void setCustomer_Land_Marked(String customer_Land_Marked) {
		this.customer_Land_Marked = customer_Land_Marked;
	}
	public String getCustomer_State_Name() {
		return customer_State_Name;
	}
	public void setCustomer_State_Name(String customer_State_Name) {
		this.customer_State_Name = customer_State_Name;
	}
	public int getCustomer_Pin_Code() {
		return customer_Pin_Code;
	}
	public void setCustomer_Pin_Code(int customer_Pin_Code) {
		this.customer_Pin_Code = customer_Pin_Code;
	}
	
	
}