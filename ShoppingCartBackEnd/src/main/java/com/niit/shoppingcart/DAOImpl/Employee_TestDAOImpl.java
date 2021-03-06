package com.niit.shoppingcart.DAOImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.shoppingcart.DAO.Employee_TestDAO;
import com.niit.shoppingcart.model.Employee_Test;

@Repository
public class Employee_TestDAOImpl implements Employee_TestDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	public Employee_TestDAOImpl(SessionFactory sessionFactory)
	{
			
		this.sessionFactory=sessionFactory;
	}
	
	@Transactional
	@SuppressWarnings("unchecked")
	public List<Employee_Test> list() {
		String hql= "from Employee_Test";
		Query query=sessionFactory.getCurrentSession().createQuery(hql);
		return query.list();

	}
	
    @Transactional
	public Employee_Test get(String id) {
		return (Employee_Test) sessionFactory.getCurrentSession().get(Employee_Test.class, id);
	}
 
    @Transactional
	public boolean save(Employee_Test employee) {
		{
			try {
				sessionFactory.getCurrentSession().save(employee);
			} catch (Exception e) {
				e.printStackTrace();
				return false;
			}
			return true;
			
		}
	}

    @Transactional
	public boolean update(Employee_Test employee) {
		try {
			sessionFactory.getCurrentSession().update(employee);
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		return true;
	}

    @Transactional
	public boolean delete(Employee_Test employee) {
		try {
			sessionFactory.getCurrentSession().delete(employee);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		return true;
	}





}

