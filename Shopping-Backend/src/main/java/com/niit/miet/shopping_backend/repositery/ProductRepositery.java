package com.niit.miet.shopping_backend.repositery;

import java.util.List;


import com.niit.miet.shopping_backend.model.Product;

public interface ProductRepositery

{
  
    public boolean addProduct(Product product);
	
	public boolean deleteProduct(int productId);
	
	public boolean updateProduct(Product product);
	
	public Product getProductById(int productId);
	
	public List<Product> getAllProduct();

}
