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
import com.niit.miet.shopping_backend.model.Customer;

@Repository
@Transactional

public class CustomerRepositeryImp implements CustomerRepositery
{
	@Autowired
	 private SessionFactory sessionFactory;
	@Override
	public boolean addCustomer(Customer customer) 
	{
		Session session=sessionFactory.getCurrentSession();
		try {
		session.persist(customer);
		return true;
		}
		catch(HibernateException exception)
		{
			exception.printStackTrace();
			return false;
			
		}	
	}

	@Override
	public boolean deleteCustomer(int customerId) 
	{

		Session session=sessionFactory.getCurrentSession();
		try
		{
			session.delete(getCustomerById(customerId));
			return true;
		}
		catch(HibernateException exception)
		{
		return false;
		}	
	}

	@Override
	public boolean updateCustomer(Customer customer)
	{
		Session session=sessionFactory.getCurrentSession();
		try
		{
			session.update(customer);
			return true;
		}
		catch(HibernateException exception)
		{
		return false;
		}
	}

	@Override
	public Customer getCustomerById(int customerId) {
		Session session=sessionFactory.getCurrentSession();
		try
		{
			Customer customer=session.get(Customer.class, customerId);
			
			return customer;
			
		}
		
		catch(HibernateException exception)
		{
		return null;
		}
		
	}

	@Override
	public List<Customer> getAllCustomer() {
		System.out.println("get all customer");
		Session session=sessionFactory.getCurrentSession();
		Query query=session.createQuery("from Customer");
		List<Customer> list=(List<Customer>)query.getResultList();
		return list;
	}
		
	}
	
	


