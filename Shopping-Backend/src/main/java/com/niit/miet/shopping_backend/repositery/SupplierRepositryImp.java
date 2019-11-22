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
import com.niit.miet.shopping_backend.model.Supplier;

@Repository
@Transactional
public class SupplierRepositryImp implements SupplierRepositery

{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public boolean addSupplier(Supplier supplier) {
		Session session=sessionFactory.getCurrentSession();
		try {
		session.persist(supplier);
		return true;
		}
		catch(HibernateException exception)
		{
			exception.printStackTrace();
			return false;
			
		}
}

	@Override
	public boolean deleteSupplier(int supplierId)
	{
		Session session=sessionFactory.getCurrentSession();
		try
		{
			session.delete(getSupplierById(supplierId));
			return true;
		}
		catch(HibernateException exception)
		{
		return false;
		}
	}

	@Override
	public boolean updateSupplier(Supplier supplier) 
	{
		
		Session session=sessionFactory.getCurrentSession();
		try
		{
			session.update(supplier);
			return true;
		}
		catch(HibernateException exception)
		{
		return false;
		}
	}

	@Override
	public Supplier getSupplierById(int supplierId) 
	{
		Session session=sessionFactory.getCurrentSession();
		try
		{
			Supplier supplier=session.get(Supplier.class, supplierId);
			
			return supplier;
			
		}
		
		catch(HibernateException exception)
		{
		return null;
		}
	}

	@Override
	public List<Supplier> getAllSupplier()
	{
		System.out.println("get all supplier");
		Session session=sessionFactory.getCurrentSession();
		Query query=session.createQuery("from Supplier");
		List<Supplier> list=(List<Supplier>)query.getResultList();
		return list;
	
	}
	
}	
