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

	// @Test
	@SuppressWarnings("deprecation")
	public void saveTestCase() {
		supplier.setId("018");
		supplier.setName("Abhay_Motors");
		supplier.setAddress("Pune");

		Assert.assertEquals("saveTestCase", true, supplierDAO.save(supplier));
	}

	@SuppressWarnings("deprecation")
	// @Test
	public void updateTestCase() {
		supplier = supplierDAO.get("S103");
		supplier.setName("Kamat_Motors");
		Assert.assertEquals("updateTestCase", true, supplierDAO.update(supplier));
	}

	@SuppressWarnings("deprecation")
	//@Test
	public void deleteTestCase() {
		supplier = supplierDAO.get("S016");
		Assert.assertEquals("deleteTestCase", true, supplierDAO.delete(supplier));

	}

	@SuppressWarnings("deprecation")
	// @Test
	public void getTestCase() {
		supplier = supplierDAO.get("S102");
		Assert.assertNotNull("getTestCase", supplier);

	}

	@SuppressWarnings("deprecation")
	//@Test
	public void listTestCase() {

		int size=supplierDAO.list().size();
		Assert.assertEquals("length check", 12, size);
		
	}
	@Test
	@SuppressWarnings("deprecation")
	public void getNameTestCase() {
		
		supplier=supplierDAO.getName("ABC Motors");

		Assert.assertNotNull("getNameTestCase", supplier);
	}
}
