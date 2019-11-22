package com.niit.miet.shopping_backend.repositery;
import java.util.List;


import com.niit.miet.shopping_backend.model.Shipping;


public interface ShippingRepositery 
{
public boolean addShipping(Shipping shipping);
	
	public boolean deleteShipping(int shippingId);
	
	public boolean updateShipping(Shipping shipping);
	
	public Shipping getShippingById(int shippingId);
	
	public List<Shipping> getAllShipping();
	
}
