package com.niit.shoppingcart.DAOImpl;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.shoppingcart.DAO.BillingAddressDAO;
import com.niit.shoppingcart.model.BillingAddress;

@Repository
public class BillingAddressDAOImpl implements BillingAddressDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public BillingAddressDAOImpl(SessionFactory sessionFactory){
		this.sessionFactory=sessionFactory;		
	}

	
	@Transactional
	public boolean save(BillingAddress billingAddress) {
		try {
			sessionFactory.getCurrentSession().save(billingAddress);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Transactional
	public boolean delete(BillingAddress billingAddress) {
		try {
			sessionFactory.getCurrentSession().delete(billingAddress);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;

		}
		return true;
	}

	@Transactional
	public BillingAddress get(String id) {
		// TODO Auto-generated method stub
		return null;
	}
	


	

	
	

}
