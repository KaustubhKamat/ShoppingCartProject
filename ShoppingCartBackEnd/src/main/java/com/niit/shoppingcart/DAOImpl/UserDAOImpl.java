package com.niit.shoppingcart.DAOImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.apache.commons.logging.LogFactory;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.niit.shoppingcart.DAO.UserDAO;
import com.niit.shoppingcart.model.User1;

//Implement all the methods created in UserDAO interface here by implements statement
@Repository
public class UserDAOImpl implements UserDAO {

	
	// Session factory is required to do the operations in the database

	
	
	
	@Autowired
	private SessionFactory sessionfactory;

	// How to initialize
	// at the time of creation of instance you have to pass the session factory
	// by writing your own constructor

	@Autowired
	public UserDAOImpl(SessionFactory sessionFactory) {
		this.sessionfactory = sessionFactory;
	}

	@SuppressWarnings("unchecked")
	@Transactional
	public List<User1> list() {

		String hql = "from User1";
		Query query = sessionfactory.getCurrentSession().createQuery(hql);// It
																			// will
																			// convert
																			// into
																			// DB
																			// specific
																			// language
		return query.list();// It will give list of objects, but we have to
							// return list of user so we need to typecast
	}

	@Transactional
	public User1 get(String Emailid) {

		return (User1) sessionfactory.getCurrentSession().get(User1.class, Emailid);
		// when you take mouse
	}

	// Query from H2 Database-SELECT * FROM USER1 where Emailid ='niit' and
	// password='niit'

	@Transactional
	public User1 validate(String emailid, String password) {
		String hql = "FROM User1 where Emailid ='" + emailid + "' and password='" + password + "'";// we
																											// have
																											// to
																											// not
																											// hardcode
																											// the
																											// values
		Query query = sessionfactory.getCurrentSession().createQuery(hql);
		return (User1) query.uniqueResult();// This shows only one record and it
											// is typecasted from object to
											// user1

	}

	@Transactional
	public boolean save(User1 user) {

		try {
			sessionfactory.getCurrentSession().save(user);
		} catch (Exception e) {
			e.printStackTrace();// is same as sysout and will show the error
			return false;
		}
		return true;
	}

	@Transactional
	public boolean update(User1 user) {

		try {
			sessionfactory.getCurrentSession().update(user);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();// is same as sysout and will show the error
			return false;
		}
		return true;
	}

}
