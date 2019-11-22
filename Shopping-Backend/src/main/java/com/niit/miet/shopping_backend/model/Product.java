package com.niit.miet.shopping_backend.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
// here we don't used @Table Annotation because automatic table formed by the class name
public class Product implements Serializable

{
	
		@Id
		@GeneratedValue(strategy=GenerationType.SEQUENCE)
		private int productId;
		private String productName;
		private String productDesc;
		private int stock;
		private int price;
		private int categoryId;
		
		@ManyToOne()// For the Mapping 
		@JoinColumn(name="categoryId",insertable = false,updatable=false,nullable=false)// This annotation this used to tell at which column data is going
		private Category category; //Create the reference of the Category Table
		
		
		
		public int getProductId()
		{
			return productId;
		}
		
		public void setProductId(int productId)
		{
			this.productId = productId;
		}
		
		public String getProductName()
		{
			return productName;
		}
		
		public void setProductName(String productName)
		{
			this.productName = productName;
		}
		
		public String getProductDesc() 
		{
			return productDesc;
		}
		
		
		public void setProductDesc(String productDesc)
		{
			this.productDesc = productDesc;
		}
		
		
		public int getStock() 
		{
			return stock;
		}
		
		
		public void setStock(int stock)
		{
			this.stock = stock;
		}
		
		
		public int getPrice()
		{
			return price;
		}
		
		
		public void setPrice(int price)
		{
			this.price = price;
		}
		
		
		public int getCategoryId()
		{
			return categoryId;
		}
		
		
		public void setCategoryId(int categoryId)
		{
			this.categoryId = categoryId;
		}
		
		
		public Category getCategory() 
		{
			return category;
		}
		
		
		
		public void setCategory(Category category)
		{
			this.category = category;
		}
		
		
		
		
		
		
}
