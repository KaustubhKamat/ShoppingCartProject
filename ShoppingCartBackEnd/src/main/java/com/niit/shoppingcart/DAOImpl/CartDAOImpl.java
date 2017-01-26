package com.niit.shoppingcart.DAOImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.niit.shoppingcart.DAO.CartDAO;
import com.niit.shoppingcart.model.Cart;

@Repository
public class CartDAOImpl implements CartDAO {
	
	public Logger log=LoggerFactory.getLogger(CartDAOImpl.class);
	
	public SessionFactory sessionFactory;

	public CartDAOImpl (SessionFactory sessionFactory)
	{
		this.sessionFactory=sessionFactory;
	}

	@SuppressWarnings("unchecked")
	@Transactional
	public List<Cart> list(String emailid) {
		log.debug("Starting the method list");
		
		String hql= "FROM Cart where Emailid ='" + emailid  + "'";
		Query query=sessionFactory.getCurrentSession().createQuery(hql);
		log.debug("Ending the method list");
		return query.list();
	}

	@Transactional
	public boolean Save(Cart cart) {
		log.debug("Starting the method save cart");
		sessionFactory.getCurrentSession().save(cart);
		log.debug("Ending the method save cart");
		return true;				
	}

	@Transactional
	public boolean Update(Cart cart) {
		log.debug("Start the method update cart");
		try {
			sessionFactory.getCurrentSession().update(cart);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		log.debug("Endind the method update cart");
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

	@Transactional
	public long getTotalAmount(String emailid) {
		log.debug("Starting the method getTotalAmountFromCart");
		String hql="select sum(total_price) from cart where Emailid= " + "'" + emailid +"'";
		log.debug("hql" +hql);
		Query query=sessionFactory.getCurrentSession().createQuery(hql);
		Long sum= (Long) query.uniqueResult();
		log.debug("Ending the method getTotalAmountFromCart");
		return sum;
	}

	
	public Long getMaxId(){
		log.debug("Starting the method getMaxId");
		Long maxID=(long) 100;
		
		try {
			String hql="select max(id) from cart ";
			Query query=sessionFactory.getCurrentSession().createQuery(hql);
			maxID=(Long) query.uniqueResult();
				
		} catch (Exception e) {
			log.debug("It seems this is first record. The initial record is set to 100");
			maxID=(long) 100;
			e.printStackTrace();
		}
		
		return null;
		
	}
	

	
}
