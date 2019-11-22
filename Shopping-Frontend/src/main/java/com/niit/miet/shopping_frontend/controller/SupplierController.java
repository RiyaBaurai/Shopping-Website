package com.niit.miet.shopping_frontend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import com.niit.miet.shopping_backend.model.Supplier;
import com.niit.miet.shopping_backend.repositery.SupplierRepositery;
@Controller
public class SupplierController 

{
	@Autowired
	private SupplierRepositery supplierRepositery;
	
	@RequestMapping(value="/addSupplier",method=RequestMethod.POST)
	public String addSupplier(@ModelAttribute("supplier") Supplier supplier)
	{
		if(supplier.getSupplierId()==0)
	{
		if (supplierRepositery.addSupplier(supplier))
			return "redirect:/supplierHome";
		else 
			return null;
	}
		
		else
		{
			supplierRepositery.updateSupplier(supplier);
			
          return "supplier";	
		}
	}
	
	@RequestMapping(value="/deleteSupplier/{supplierId}",method=RequestMethod.GET)
	public String deleteSupplier(@PathVariable("supplierId") int supplierId)
	{
		if(supplierRepositery.deleteSupplier( supplierId))
			return "redirect:/supplierHome";
		else
			
			return null;
    }
	
	@RequestMapping(value="/updateSupplier/{supplierId}",method=RequestMethod.GET)
	public String updateSupplier(@PathVariable("supplerId") int supplierId,Model model)
	{
	  model.addAttribute("supplier",supplierRepositery.getSupplierById(supplierId));
      model.addAttribute("supplierList",supplierRepositery.getAllSupplier());
	 return "supplier";	
	}
}
