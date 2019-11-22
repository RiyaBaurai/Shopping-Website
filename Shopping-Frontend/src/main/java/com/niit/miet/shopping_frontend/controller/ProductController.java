package com.niit.miet.shopping_frontend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import com.niit.miet.shopping_backend.model.Product;
import com.niit.miet.shopping_backend.repositery.CategoryRespositery;
@Controller
public class ProductController

{

	
	@Autowired
	private CategoryRespositery categoryRespositery;
	
	@RequestMapping(value="/ addProduct",method=RequestMethod.POST)
	public String addProduct(@ModelAttribute("product") Product product,Model model)
	{
		       
		 		  model.addAttribute("categoryList",categoryRespositery.getAllCategory());

	
		  return "category";
	}
}

	
