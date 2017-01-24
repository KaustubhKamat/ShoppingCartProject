package com.niit.shoppingcart.DAOImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.SessionFactory;

import com.niit.shoppingcart.DAO.CartDAO;
import com.niit.shoppingcart.model.Cart;

public class CartDAOImpl implements CartDAO {
	
	public SessionFactory sessionFactory;

	public CartDAOImpl (SessionFactory sessionFactory)
	{
		this.sessionFactory=sessionFactory;
	}

	@SuppressWarnings("unchecked")
	@Transactional
	public List<Cart> list(String emailid) {
		
		String hql= "from Cart";
		Query query=sessionFactory.getCurrentSession().createQuery(hql);
		return query.list();
	}

	@Transactional
	public boolean Save(Cart cart) {
		try {
			sessionFactory.getCurrentSession().save(cart);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
				
	}

	@Transactional
	public boolean Update(Cart cart) {
		try {
			sessionFactory.getCurrentSession().update(cart);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
		
		
	}

	@Transactional
	public boolean Delete(String id) {
		try {
			sessionFactory.getCurrentSession().delete(id);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
		
	}

	public String getTotalAmount(String emailid) {
		// TODO Auto-generated method stub
		return null;
	}

	
	

	
}
