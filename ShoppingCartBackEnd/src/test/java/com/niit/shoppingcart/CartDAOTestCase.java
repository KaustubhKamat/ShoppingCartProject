package com.niit.shoppingcart;

import java.util.Date;

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

		cartDAO = (CartDAO) context.getBean("cartDAOImpl");
		cart = (Cart) context.getBean("cart");
	}

	@SuppressWarnings("deprecation")
	@Test
	public void SaveCartTestCase() {
		cart.setId(104);
		cart.setUser_Id("abcd@gmail.com");
		cart.setPrice(30000);
		cart.setProduct_Name("Maruti Wagonr");
		cart.setQuantity("2");
		cart.setStatus("Valid");
		Date date = new Date();
		cart.setDate_Added(date);
		boolean status = cartDAO.SaveCart(cart);
		Assert.assertEquals("SaveCartTestCase", true, status);
	}

	//@Test
	public void DeleteCartTestCase() {
		boolean status=cartDAO.DeleteCart("102");
		Assert.assertEquals("DeleteCartTestCase", true, status);
	}
	
	//@Test
	public void getTotalAmountTestCase()
	{
		long l=cartDAO.getTotalAmount("abcd@gmail.com");
		System.out.println(l);
	}

	//@Test
	public void getCartListTestCase()
	{
	cart=(Cart) cartDAO.list("kaustubh235@gmail.com");
	System.out.println(cart.getPrice());
	}

}
