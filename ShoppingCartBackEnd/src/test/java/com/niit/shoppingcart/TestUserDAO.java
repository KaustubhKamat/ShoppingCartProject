package com.niit.shoppingcart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Repository;

import com.niit.shoppingcart.DAO.UserDAO;
import com.niit.shoppingcart.model.User1;

public class TestUserDAO {


@Autowired//injects the automatic instance so we can call the methods
UserDAO userDAO;

@Autowired
User1 user;

@Autowired
AnnotationConfigApplicationContext context;//context is a bean factory

@Autowired
public TestUserDAO(){
	context=new AnnotationConfigApplicationContext();
	//specify in which package you defined the classes.So to do this we use scan
	context.scan("com.niit.shoppingcart");//scan will read all the classes that are defined in the particular package
	//and will create instance of the class automatically.
	context.refresh();//if any instances are present in the context then it will clear all the instances and create new
	
	//Now ask the context to get the instance by using below method
	
	userDAO= (UserDAO) context.getBean("userDAOImpl");//it will get the instance of UserDAO. we need to type cast that
	// we will get the exception as No such bean is avilable
	
	user= (User1) context.getBean("user1");//it will get the instance of user. we need to type cast that
		
}

public boolean validate(String id, String pwd)
{
	if (userDAO.validate(id, pwd)==null)
			{
		System.out.println("User does not exist");      
		return false;
			}
	else
	{
		System.out.println("User exists");
		return true;
	}	
	}

public static void main(String[]args)
{
	TestUserDAO t=new TestUserDAO();
	t.validate("niit", "niit");
}



}
