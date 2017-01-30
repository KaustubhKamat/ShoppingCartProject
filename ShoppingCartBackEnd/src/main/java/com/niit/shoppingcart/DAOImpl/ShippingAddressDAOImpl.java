package com.niit.shoppingcart.DAOImpl;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.shoppingcart.DAO.ShippingAddressDAO;
import com.niit.shoppingcart.model.ShippingAddress;

@Repository
public class ShippingAddressDAOImpl implements ShippingAddressDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public ShippingAddressDAOImpl(SessionFactory sessionFactory) {

		this.sessionFactory = sessionFactory;
	}


	@Transactional
	public boolean save(ShippingAddress shippingAddress) {
		try {
			sessionFactory.getCurrentSession().save(shippingAddress);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;

		}

		return true;
	}

	@Transactional
	public boolean delete(ShippingAddress shippingAddress) {
		try {
			sessionFactory.getCurrentSession().delete(shippingAddress);
		} catch (Exception e) {
			e.printStackTrace();
			return true;
		}
		return false;
	}

	@Transactional
	public ShippingAddress get(String id) {
		// TODO Auto-generated method stub
		return null;
	}
}
