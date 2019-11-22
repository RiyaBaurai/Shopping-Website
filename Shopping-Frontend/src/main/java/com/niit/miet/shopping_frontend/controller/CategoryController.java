package com.niit.miet.shopping_frontend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.niit.miet.shopping_backend.model.Category;
import com.niit.miet.shopping_backend.repositery.CategoryRespositery;

@Controller
public class CategoryController {

	@Autowired
	private CategoryRespositery categoryRespositery;
	
	@RequestMapping(value="/addCategory",method=RequestMethod.POST)
	public String addCategory(@ModelAttribute("category") Category category)
	{
		if(category.getCategoryId()==0)
	{
		if (categoryRespositery.addCategory(category))
			return "redirect:/categoryHome";
		else 
			return null;
	}
		
		else
		{
			categoryRespositery.updateCategory(category);
			
          return "category";	
		}
	}
	
	@RequestMapping(value="/deleteCategory/{categoryId}",method=RequestMethod.GET)
	public String deleteCategory(@PathVariable("categoryId") int categoryId)
	{
		if(categoryRespositery.deleteCategory( categoryId))
			return "redirect:/categoryHome";
		else
			
			return null;
    }
	
	@RequestMapping(value="/updateCategory/{categoryId}",method=RequestMethod.GET)
	public String updateCategory(@PathVariable("categoryId") int categoryId,Model model)
	{
	  model.addAttribute("category",categoryRespositery.getCategoryById(categoryId));
	  model.addAttribute("categoryList",categoryRespositery.getAllCategory());
	  return "category";	
	}
}
