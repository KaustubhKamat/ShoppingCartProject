package com.niit.shoppingcart;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.shoppingcart.DAO.CategoryDAO;
import com.niit.shoppingcart.model.Category;

import junit.framework.Assert;

public class CategoryDAOTestCase {

	@Autowired
	static CategoryDAO categoryDAO;

	@Autowired
	static Category category;

	@Autowired
	static AnnotationConfigApplicationContext context;

	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.shoppingcart");
		context.refresh();

		categoryDAO = (CategoryDAO) context.getBean("categoryDAOImpl");
		category = (Category) context.getBean("category");
	}

	
	//@Test
	public void saveTestCase()
	{
		category.setid("0103");
		category.setName("Maruti Ritz");
		category.setDescription("This is a petrol ZXI version");
		
		Assert.assertEquals("saveTestCase",true,categoryDAO.save(category));
	}

	@Test
	public void updateTestCase()
	{
		category=categoryDAO.get("0102");
		category.setName("Ritz");
		
		Assert.assertEquals("updateTestCase", true, categoryDAO.update(category));
		
	}

	//@Test
	public void deleteTestCase()
	{
		category=categoryDAO.get("0101");
		
		Assert.assertEquals("deleteTestCase", true, categoryDAO.delete(category));
		
	}

}