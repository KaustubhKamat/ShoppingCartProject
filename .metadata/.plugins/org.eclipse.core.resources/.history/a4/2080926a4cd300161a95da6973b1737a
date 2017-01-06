package com.niit.shoppingcart;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.shoppingcart.DAO.SupplierDAO;
import com.niit.shoppingcart.model.Supplier;

import junit.framework.Assert;

public class SupplierDAOTestCase {

	@Autowired
	static SupplierDAO supplierDAO;
	
	@Autowired
	static Supplier supplier;

	@Autowired
	static AnnotationConfigApplicationContext context;
	
	@BeforeClass
	public static void init()
	{
		context=new AnnotationConfigApplicationContext();
		context.scan("com.niit.shoppingcart");
		context.refresh();
		
		supplierDAO= (SupplierDAO) context.getBean("supplierDAOImpl");
		supplier= (Supplier) context.getBean("supplier");
	}
	
	@SuppressWarnings("deprecation")
	//@Test
	public void saveTestCase()
	{
		supplier.setId("S103");
		supplier.setName("Arun");
		supplier.setAddress("Deccan,Pune");
		
		Assert.assertEquals("saveTestCase", true, supplierDAO.save(supplier));
		
	}
	
	//@Test
	@SuppressWarnings("deprecation")
	public void getUserTestCase()
	{
		supplierDAO.get("s102");
		Assert.assertNotNull("getUserTestCase", supplier);
	}
	
	@SuppressWarnings("deprecation")
	//@Test
	public void updateTestCase()
	{
		supplier= supplierDAO.get("s102");
		supplier.setName("Amit");
		Assert.assertEquals("updateTestCase",false,supplierDAO.update(supplier));
		
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void deleteTestCase()
	{
    		supplier= supplierDAO.get("s101");
    		Assert.assertEquals("deleteTestCase", true, supplierDAO.delete(supplier));
	}
}
