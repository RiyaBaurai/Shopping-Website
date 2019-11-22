package com.niit.miet.shopping_backend.repositery;

import java.util.List;

import com.niit.miet.shopping_backend.model.Supplier;

public interface SupplierRepositery

{
    public boolean addSupplier(Supplier supplier);
	
	public boolean deleteSupplier(int supplierId);
	
	public boolean updateSupplier(Supplier supplier);
	
	public Supplier getSupplierById(int supplierId);
	
	public List<Supplier> getAllSupplier();

}
