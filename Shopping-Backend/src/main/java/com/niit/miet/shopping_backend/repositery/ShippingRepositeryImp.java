package com.niit.miet.shopping_backend.repositery;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.niit.miet.shopping_backend.model.Shipping;

@Repository
@Transactional 
public class ShippingRepositeryImp implements ShippingRepositery
{
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public boolean addShipping(Shipping shipping) 
	{
		Session session=sessionFactory.getCurrentSession();
		try {
		session.persist(shipping);
		return true;
		}
		catch(HibernateException exception)
		{
			exception.printStackTrace();
			return false;
			
		}
	}

	@Override
	public boolean deleteShipping(int shippingId)
	{
		Session session=sessionFactory.getCurrentSession();
		try
		{
			session.delete(getShippingById(shippingId));
			return true;
		}
		catch(HibernateException exception)
		{
		return false;
		}
	}

	@Override
	public boolean updateShipping(Shipping shipping)
	{
		Session session=sessionFactory.getCurrentSession();
		try
		{
			session.update(shipping);
			return true;
		}
		catch(HibernateException exception)
		{
		return false;
		}
	}

	@Override
	public Shipping getShippingById(int shippingId)
	{
		Session session=sessionFactory.getCurrentSession();
		try
		{
			Shipping shipping=session.get(Shipping.class, shippingId);
			
			return shipping;
			
		}
		
		catch(HibernateException exception)
		{
		return null;
		}
		
	}

	@Override
	public List<Shipping> getAllShipping() 
	{
		
		System.out.println("get all shipping");
		Session session=sessionFactory.getCurrentSession();
		Query query=session.createQuery("from Shipping");
		List<Shipping> list=(List<Shipping>)query.getResultList();
		return list;
	}


}
