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
	@SuppressWarnings("deprecation")
	public void saveTestCase() {
		category.setid("0107");
		category.setName("Maruti");
		category.setDescription("This is a petrol VXI version");

		Assert.assertEquals("saveTestCase", true, categoryDAO.save(category));
	}

	@SuppressWarnings("deprecation")
	//@Test
	public void updateTestCase() {
		category = categoryDAO.get("1234");
		category.setName("Ritz");

		Assert.assertEquals("updateTestCase", true, categoryDAO.update(category));

	}
	
	@Test
	@SuppressWarnings("deprecation")
	public void deleteTestCase() {
		category = categoryDAO.get(",C101,,C101,,C101,,C101");

		Assert.assertEquals("deleteTestCase", true, categoryDAO.delete(category));

	}
	@Test
	@SuppressWarnings("deprecation")
	public void getNameTestCase() {
		category = categoryDAO.getName("Hatchback");

		Assert.assertNotNull("getNameTestCase", category);
	}
}
