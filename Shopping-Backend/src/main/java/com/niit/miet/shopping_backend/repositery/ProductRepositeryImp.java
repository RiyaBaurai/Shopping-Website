package com.niit.miet.shopping_backend.repositery;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.miet.shopping_backend.model.Product;
@Repository
@Transactional
public class ProductRepositeryImp implements ProductRepositery 
{
  @Autowired
  private SessionFactory sessionFactory;
	@Override
	public boolean addProduct(Product product)
	{
		
		Session session=sessionFactory.getCurrentSession();
		try {
		session.persist(product);
		return true;
		}
		catch(HibernateException exception)
		{
			exception.printStackTrace();
			return false;
			
		}
	}

	@Override
	public boolean deleteProduct(int productId) {
		
		return false;
	}

	@Override
	public boolean updateProduct(Product product) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Product getProductById(int productId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getAllProduct() {
		// TODO Auto-generated method stub
		return null;
	}

}
