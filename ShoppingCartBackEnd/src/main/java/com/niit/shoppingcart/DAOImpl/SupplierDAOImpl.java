package com.niit.shoppingcart.DAOImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.shoppingcart.DAO.SupplierDAO;
import com.niit.shoppingcart.model.Supplier;

@Repository
public class SupplierDAOImpl implements SupplierDAO {
	
	public SupplierDAOImpl() {
		// TODO Auto-generated constructor stub
	}

	@Autowired
	private SessionFactory sessionFactory;

	public SupplierDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@SuppressWarnings("unchecked")
	@Transactional
	public List<Supplier> list() {
		String hql = "from Supplier";

		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		return query.list();

	}

	@Transactional
	public Supplier get(String id) {
		return (Supplier) sessionFactory.getCurrentSession().get(Supplier.class, id);

	}

	// SELECT * FROM SUPPLIER where id='kaustubh'
	@Transactional
	public Supplier validate(String id) {
		String hql = "SELECT * FROM SUPPLIER where id='" + id + "'";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);

		return (Supplier) query.uniqueResult();
	}

	@Transactional
	public boolean save(Supplier supplier) {
		
			try {
				sessionFactory.getCurrentSession().save(supplier);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return false;
				 
			}
		
		return true;
	}

	@Transactional
	public boolean update(Supplier supplier) {

		try {
			sessionFactory.getCurrentSession().update(supplier);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

		return true;
	}

	@Transactional
	public boolean delete(Supplier supplier)
	{
		try {
			sessionFactory.getCurrentSession().delete(supplier);
		} catch (Exception e) {
			e.printStackTrace();
			return true;
		}
		return false;
	}
	
	@Transactional
	public Supplier getName(String name)
	{
		String hql1= "FROM Supplier WHERE name="+"'" + name +"'";
		Query query=sessionFactory.getCurrentSession().createQuery(hql1);
		return (Supplier) query.uniqueResult();
		
		//return (Supplier) query.uniqueResult();
	
		
		
	}
}
