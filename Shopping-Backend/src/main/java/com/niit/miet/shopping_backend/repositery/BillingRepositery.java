package com.niit.miet.shopping_backend.repositery;
import java.util.List;

import com.niit.miet.shopping_backend.model.Billing;



public interface BillingRepositery
{
public boolean addBilling(Billing billing);
	
	public boolean deleteBilling(int billingId);
	
	public boolean updateBilling(Billing billing);
	
	public Billing getBillingById(int billingId);
	
	public List<Billing> getAllBilling();
	
}
