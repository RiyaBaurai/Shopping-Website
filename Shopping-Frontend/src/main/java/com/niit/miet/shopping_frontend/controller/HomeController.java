package com.niit.miet.shopping_frontend.controller;

import javax.inject.Qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.niit.miet.shopping_backend.model.Category;
import com.niit.miet.shopping_backend.model.Product;
import com.niit.miet.shopping_backend.model.Supplier;
import com.niit.miet.shopping_backend.repositery.CategoryRespositery;
import com.niit.miet.shopping_backend.repositery.SupplierRepositery;

@Controller
public class HomeController {
	
	@Autowired
	CategoryRespositery categoryRespositery;
	SupplierRepositery supplierRepositery;
	
	@RequestMapping("/")
	public String homePage()
	{
		
	return "index";
	}
	
	@RequestMapping("/login")
	public String loginPage()
	{
		return "login";
	}
	
	@RequestMapping("/registeration")
	public String registerationPage()
	{
		return "registeration";
	}


	@RequestMapping("/admin")
	public String adminHomePage()
	{
		return "adminHome";
	}
	
	@RequestMapping("/categoryHome")
	public String categoryHomePage(Model model)
	
	{
		model.addAttribute("categoryList",categoryRespositery.getAllCategory());
		model.addAttribute("category",new Category());
		return "category";
	}
	
	
	@RequestMapping("/productHome")
	public String productHomePage(Model model)
	
	{
		model.addAttribute("categoryList",categoryRespositery.getAllCategory());
		model.addAttribute("product",new Product());
		return "product";
	}
	
	
	@RequestMapping("/supplierHome")
	public String supplierHomePage(Model model)
	
	{
		//model.addAttribute("supplierList",supplierRepositery.getAllSupplier());
		model.addAttribute("supplier",new Supplier());
		return "supplier";
	}
	
	
	
}
