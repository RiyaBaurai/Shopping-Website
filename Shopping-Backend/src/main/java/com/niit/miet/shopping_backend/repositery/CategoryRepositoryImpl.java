package com.niit.miet.shopping_backend.repositery;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.miet.shopping_backend.model.Category;

@Repository
@Transactional
public class CategoryRepositoryImpl implements CategoryRespositery {
    @Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public boolean addCategory(Category category) {
		Session session=sessionFactory.getCurrentSession();
		try {
		session.persist(category);
		return true;
		}
		catch(HibernateException exception)
		{
			exception.printStackTrace();
			return false;
			
		}
	}

	@Override
	public boolean deleteCategory(int categoryId)
	{
	
		Session session=sessionFactory.getCurrentSession();
		try
		{
			session.delete(getCategoryById(categoryId));
			return true;
		}
		catch(HibernateException exception)
		{
		return false;
		}
	}

	@Override
	public boolean updateCategory(Category category)
	{
		Session session=sessionFactory.getCurrentSession();
		try
		{
			session.update(category);
			return true;
		}
		catch(HibernateException exception)
		{
		return false;
		}
	}

	@Override
	public Category getCategoryById(int categoryId)
	{
		Session session=sessionFactory.getCurrentSession();
		try
		{
			Category category=session.get(Category.class, categoryId);
			
			return category;
			
		}
		
		catch(HibernateException exception)
		{
		return null;
		}
		
		
		
		
	}
	@Override
	public List<Category> getAllCategory() {
		System.out.println("get all category");
		Session session=sessionFactory.getCurrentSession();
		Query query=session.createQuery("from Category");
		List<Category> list=(List<Category>)query.getResultList();
		return list;
	}

}
