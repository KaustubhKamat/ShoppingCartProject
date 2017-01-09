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
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.shoppingcart");
		context.refresh();

		supplierDAO = (SupplierDAO) context.getBean("supplierDAOImpl");
		supplier = (Supplier) context.getBean("supplier");
	}

	//@Test
	@SuppressWarnings("deprecation")
	public void saveTestCase() {
		supplier.setId("S014");
		supplier.setName("Vinayak_Motors");
		supplier.setAddress("Katraj,Pune");

		Assert.assertEquals("saveTestCase", true, supplierDAO.save(supplier));
	}

	@SuppressWarnings("deprecation")
	@Test
	public void updateTestCase() {
		supplier = supplierDAO.get("S103");
		supplier.setName("Arun_Motors");
		Assert.assertEquals("updateTestCase", true, supplierDAO.update(supplier));
	}

	@SuppressWarnings("deprecation")
	// @Test
	public void deleteTestCase() {
		supplier = supplierDAO.get("S012");
		Assert.assertEquals("deleteTestCase", true, supplierDAO.delete(supplier));

	}

	@SuppressWarnings("deprecation")
	//@Test
	public void getTestCase() {
		supplier = supplierDAO.get("S102");
		Assert.assertNotNull("getTestCase", supplier);

	}
}
