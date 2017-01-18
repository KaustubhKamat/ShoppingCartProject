package com.niit.shoppingcart;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.shoppingcart.DAO.Employee_TestDAO;
import com.niit.shoppingcart.model.Employee_Test;
import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class Employee_TestDAOTestCase {

	@Autowired
	static Employee_TestDAO employee_TestDAO;

	@Autowired
	static Employee_Test employee_Test;

	@Autowired
	static AnnotationConfigApplicationContext context;

	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.shoppingcart");
		context.refresh();

		employee_TestDAO=(Employee_TestDAO) context.getBean("employee_TestDAOImpl");
		employee_Test=(Employee_Test) context.getBean("employee_Test");
		
	}

	//@Test
	@SuppressWarnings("deprecation")
	public void saveTestCase() {
		employee_Test.setEmail("abcd@gmail.com");
		employee_Test.setFirstName("abcd");
		employee_Test.setId("101");
		employee_Test.setLastName("efgh");
		employee_Test.setPhone("8S9089089");
		
		Assert.assertEquals("saveTestCase", true, employee_TestDAO.save(employee_Test));
	}

	@SuppressWarnings("deprecation")
	//@Test
	public void updateTestCase() {
		employee_Test=employee_TestDAO.get("1010");
		employee_Test.setEmail("Virat");
		Assert.assertEquals("updateTestCase", true, employee_TestDAO.update(employee_Test));
	}

	@SuppressWarnings("deprecation")
	//@Test
	public void deleteTestCase() {
		employee_Test = employee_TestDAO.get("1010");
		Assert.assertEquals("deleteTestCase",  true,employee_TestDAO.delete(employee_Test));

	}

	@SuppressWarnings("deprecation")
	@Test
	public void getTestCase() {
		employee_Test = employee_TestDAO.get("101");
		Assert.assertNotNull("getTestCase", employee_Test);

	}
}


