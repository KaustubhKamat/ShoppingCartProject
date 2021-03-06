package com.niit.shoppingcart.DAOImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.shoppingcart.DAO.CategoryDAO;
import com.niit.shoppingcart.model.Category;

@Repository
public class CategoryDAOImpl implements CategoryDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	public CategoryDAOImpl(SessionFactory sessionFactory)
	{
		this.sessionFactory=sessionFactory;
	}
	
	@SuppressWarnings("unchecked")
	@Transactional
	public List<Category> list() {
		String hql= "from Category";
		Query query=sessionFactory.getCurrentSession().createQuery(hql);
		return query.list();
	}

	@Transactional
	public Category get(String id) {
		return (Category) sessionFactory.getCurrentSession().get(Category.class, id);
		
	}

	//SELECT * FROM CATEGORY where emailid='niit' 
	@Transactional
	public Category validate(String id) {
		String hql= "FROM CATEGORY where emailid='" + id +"'";
		Query query=sessionFactory.getCurrentSession().createQuery(hql);
		return (Category) query.uniqueResult();
	}

	@Transactional
	public boolean save(Category category) 
	{
		try {
			sessionFactory.getCurrentSession().save(category);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
		
	}

	@Transactional
	public boolean update(Category category) {
		
		try {
			sessionFactory.getCurrentSession().update(category);
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Transactional
	public boolean delete(Category category)
	{
		
		try {
			sessionFactory.getCurrentSession().delete(category);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		return true;
		
	}
	
	@Transactional
	public Category getName(String name)
	{
		String hql1= "FROM Category WHERE name='" + name +"'";
		Query query=sessionFactory.getCurrentSession().createQuery(hql1);
		return (Category) query.uniqueResult();
	
		
		
	}

}
