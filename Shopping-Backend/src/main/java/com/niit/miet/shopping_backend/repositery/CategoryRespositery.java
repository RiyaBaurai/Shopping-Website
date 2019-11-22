package com.niit.miet.shopping_backend.repositery;

import java.util.List;

import com.niit.miet.shopping_backend.model.Category;

public interface CategoryRespositery {

	public boolean addCategory(Category category);
	
	public boolean deleteCategory(int categoryId);
	
	public boolean updateCategory(Category category);
	
	public Category getCategoryById(int categoryId);
	
	public List<Category> getAllCategory();
	
}
