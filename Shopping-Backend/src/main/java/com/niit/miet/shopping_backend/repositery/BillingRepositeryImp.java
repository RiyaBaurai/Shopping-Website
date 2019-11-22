package com.niit.miet.shopping_backend.repositery;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.miet.shopping_backend.model.Billing;


@Repository
@Transactional
public class BillingRepositeryImp implements BillingRepositery
{
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public boolean addBilling(Billing billing)
	{
		Session session=sessionFactory.getCurrentSession();
		try {
		session.persist(billing);
		return true;
		}
		catch(HibernateException exception)
		{
			exception.printStackTrace();
			return false;
			
		}
	}

	@Override
	public boolean deleteBilling(int billingId) 
	{
		Session session=sessionFactory.getCurrentSession();
		try
		{
			session.delete(getBillingById(billingId));
			return true;
		}
		catch(HibernateException exception)
		{
		return false;
		}	
	}

	@Override
	public boolean updateBilling(Billing billing) 
	{
		Session session=sessionFactory.getCurrentSession();
		try
		{
			session.update(billing);
			return true;
		}
		catch(HibernateException exception)
		{
		return false;
		}
	}

	@Override
	public Billing getBillingById(int billingId)
	{
		Session session=sessionFactory.getCurrentSession();
		try
		{
			Billing billing=session.get(Billing.class, billingId);
			
			return billing;
			
		}
		
		catch(HibernateException exception)
		{
		return null;
		}
		
	}

	@Override
	public List<Billing> getAllBilling() 
	{
		System.out.println("get all billing");
		Session session=sessionFactory.getCurrentSession();
		Query query=session.createQuery("from Billing");
		List<Billing> list=(List<Billing>)query.getResultList();
		return list;
	}

	

}
