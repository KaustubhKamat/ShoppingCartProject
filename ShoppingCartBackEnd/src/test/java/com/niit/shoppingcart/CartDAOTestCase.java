package com.niit.shoppingcart;



import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.shoppingcart.DAO.CartDAO;
import com.niit.shoppingcart.model.Cart;

import junit.framework.Assert;

public class CartDAOTestCase {

	@Autowired
	static CartDAO cartDAO;

	@Autowired
	static Cart cart;

	@Autowired
	static AnnotationConfigApplicationContext context;

	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.shoppingcart");
		context.refresh();

		cartDAO =  (CartDAO) context.getBean("cartDAOImpl");
		cart = (Cart) context.getBean("cart");
	}

	//@Test
	@SuppressWarnings("deprecation")
	public void saveTestCase() {
		cart.setId(100L);
		cart.setEmailid("kaustubh235@gmail.com");
		cart.setProduct_name("Maruti Ritz");
		cart.setQuantity("5");
		cart.setTotal_Price("50000");

		Assert.assertEquals("saveTestCase", true, cartDAO.Save(cart));
	}
	

	/*@Test
	@SuppressWarnings("deprecation")
	public void getTotalAmountTestCase() {
		cart=cartDAO.getTotalAmount("kaustubh235@gmail.com");

		Assert.assertNotNull("getNameTestCase", cart);

	}
	*/
	/*
	@Test
	@SuppressWarnings("deprecation")
	public void getNameTestCase() {
		category = categoryDAO.getName("Hatchback");

		Assert.assertNotNull("getNameTestCase", category);
	}*/
}

