package com.niit.shoppingcart;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.shoppingcart.DAO.ProductDAO;
import com.niit.shoppingcart.model.Product;

import junit.framework.Assert;

public class ProductDAOTestCase {

	@Autowired
	static ProductDAO productDAO;

	@Autowired
	static Product product;

	@Autowired
	static AnnotationConfigApplicationContext context;

	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.shoppingcart");
		context.refresh();

		productDAO = (ProductDAO) context.getBean("productDAOImpl");
		product = (Product) context.getBean("product");
	}

	//@Test
	public void saveTestCase() {
		product.setId("M0103");
		product.setName("Maruti Ertiga");
		product.setDescription("This is VXI + version");
		product.setPrice("2000");
		product.setStock("8");

		Assert.assertEquals("saveTestCase", true, productDAO.save(product));

	}

	@Test
	public void updateTestCase()
    {
    	
    	product=productDAO.get("M0102");
    	product.setDescription("This is VXI petrol model");
    	Assert.assertEquals("updateTestCase", true, productDAO.update(product));	
    	
    }
	
	//@Test
	public void deleteTestCase()
	{
		product=productDAO.get("M0101");
		Assert.assertEquals("deleteTestCase", false, productDAO.delete(product));
		
		
	}

}
