package com.niit.miet.shopping_backend.repositery;

import java.util.List;

import com.niit.miet.shopping_backend.model.Customer;

public interface CustomerRepositery
{

    public boolean addCustomer(Customer customer);
	
	public boolean deleteCustomer(int customerId);
	
	public boolean updateCustomer(Customer customer);
	
	public Customer getCustomerById(int customerId);
	
	public List<Customer> getAllCustomer();
	
}
