package com.niit.shoppingcart;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.shoppingcart.DAO.BillingAddressDAO;
import com.niit.shoppingcart.DAO.ShippingAddressDAO;
import com.niit.shoppingcart.model.BillingAddress;
import com.niit.shoppingcart.model.ShippingAddress;
import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class BillingAddressTestCase {

	@Autowired
	static BillingAddressDAO billingAddressDAO;
	
	@Autowired
	static BillingAddress billingAddress;
	
	@Autowired
	static AnnotationConfigApplicationContext context;
	
	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.shoppingcart");
		context.refresh();

		billingAddressDAO=(BillingAddressDAO) context.getBean("billingAddressDAOImpl");
		billingAddress=(BillingAddress) context.getBean("billingAddress");	
	}
	
	@Test
	public void saveBillingAddressTestCase() {
		
		billingAddress.setBillingAddressId("b101");
		billingAddress.setLine1("Flat-no7, ABC complex");
		billingAddress.setCity("Mumbai");
		billingAddress.setCountry("India");
		billingAddress.setPincode("411081");
	
		Assert.assertEquals("saveBillingAddressTestCase", true, billingAddressDAO.save(billingAddress));
	}
	
	
	/*//@Test
	public void deleteShippingAddressTestCase(){
		shippingAddress=shippingAddressDAO.get("sh-102");
		Assert.assertEquals("deleteTestCase", true, shippingAddressDAO.delete(shippingAddress));
	}*/
	
	
	
	


}
