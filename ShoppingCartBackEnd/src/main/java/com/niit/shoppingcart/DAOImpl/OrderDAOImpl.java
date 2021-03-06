package com.niit.shoppingcart.DAOImpl;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.shoppingcart.DAO.OrderDAO;
import com.niit.shoppingcart.model.Order;

@Repository
public class OrderDAOImpl implements OrderDAO {

	@Autowired
	SessionFactory sessionFactory;

	public OrderDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Transactional
	public boolean saveOrder(Order order) {
		try {
			sessionFactory.getCurrentSession().save(order);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;

		}

		return true;
	}

	@Transactional
	public boolean deleteOrder(Order order) {
		try {
			sessionFactory.getCurrentSession().delete(order);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;

		}

		return true;
	}

	@Transactional
	public Order get(int id) {
		// TODO Auto-generated method stub
		return (Order) sessionFactory.getCurrentSession().get(Order.class, id);
	}

}
