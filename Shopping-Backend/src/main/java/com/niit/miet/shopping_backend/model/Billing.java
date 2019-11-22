package com.niit.miet.shopping_backend.model;
import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity

public class Billing implements Serializable
{
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	
	private int customerId;
	private int customer_Card_No;
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public int getCustomer_Card_No() {
		return customer_Card_No;
	}
	public void setCustomer_Card_No(int customer_Card_No) {
		this.customer_Card_No = customer_Card_No;
	}
	public String getCustomer_Name_On_Card() {
		return customer_Name_On_Card;
	}
	public void setCustomer_Name_On_Card(String customer_Name_On_Card) {
		this.customer_Name_On_Card = customer_Name_On_Card;
	}
	public String getCustomer_Card_Cvv() {
		return customer_Card_Cvv;
	}
	public void setCustomer_Card_Cvv(String customer_Card_Cvv) {
		this.customer_Card_Cvv = customer_Card_Cvv;
	}
	public int getCustomer_Expired_Month() {
		return customer_Expired_Month;
	}
	public void setCustomer_Expired_Month(int customer_Expired_Month) {
		this.customer_Expired_Month = customer_Expired_Month;
	}
	public int getCustomer_Expired_Year() {
		return customer_Expired_Year;
	}
	public void setCustomer_Expired_Year(int customer_Expired_Year) {
		this.customer_Expired_Year = customer_Expired_Year;
	}
	private String customer_Name_On_Card;
	
	private String customer_Card_Cvv;
	private int customer_Expired_Month;
	private int customer_Expired_Year;
	
	
	
	
	
	
	
	
}
