package com.niit.shoppingcart;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.shoppingcart.DAO.UserDAO;
import com.niit.shoppingcart.model.User1;

import junit.framework.Assert;

public class UserDAOTestCase {

	@Autowired
	static UserDAO userDAO;
	
	@Autowired
	static User1 user;
	
	@Autowired
	static AnnotationConfigApplicationContext context; 

	
	@BeforeClass
	public static void init(){
		context=new AnnotationConfigApplicationContext();
		context.scan("com.niit");
		context.refresh();
		
		user=(User1) context.getBean("userDAO");
		
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void getUserTestCase()
	{
		user= userDAO.get("niit");// we are passing id and getting user
		
		//Assert statements which can be executed if the current statement is false
       Assert.assertEquals("User Test Case", "niit", user.getClass());

	}
	
	/*@Test
	public void validateCrdentials(){
		userDAO.validate("niit","niit");
		Assert.assertEquals(message, expected, actual);
	}*/




}
