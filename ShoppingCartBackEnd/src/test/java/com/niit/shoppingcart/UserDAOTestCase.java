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
		context.scan("com.niit.shoppingcart");
		context.refresh();
		
		
		userDAO= (UserDAO) context.getBean("userDAOImpl");
		user= (User1) context.getBean("user1");
		
	}
	
	//@Test
	public void getUserTestCase()
	{
		user= userDAO.get("kaustubh235@gmail.com");// we are passing id and getting user
		
		//Assert statements which can be executed if the current statement is false
       Assert.assertNotNull("getUserTestCase", user);

	}
	
	//@Test
	public void validateCrdentials(){
		userDAO.validate("niit","niit");
		Assert.assertNotNull("validateCrdentials", user);
	
	}
	
	//@Test
	public void getAllUsersTestCase()
	{
		int size=userDAO.list().size();
		Assert.assertEquals("length check", 1, size);
	}
    
	@SuppressWarnings("deprecation")
	//@Test
	public void saveTestCase()
	{
	user.setEmailid("abhi@yahoo.com");
	user.setName("abhi");
	user.setPassword("abhi1234");
	user.setMobile("787678909");
	user.setRole("Customer");
	
	Assert.assertEquals("saveTestCase", true, userDAO.save(user));
	
	}
	//@Test
	public void UpdateTestCase()
	{
		user= userDAO.get("kaustubh235@gmail.com");
		user.setMobile("98989898898");
		Assert.assertEquals("updateTestCase",true,userDAO.update(user));
		
	}


}
