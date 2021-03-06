package com.niit.shoppingcart.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@ComponentScan("com.niit.shoppingcart")
public class OrderWebFlow {


	public static Logger log = LoggerFactory.getLogger(OrderWebFlow.class);
	
	@Autowired
	Order order;


public Order initflow()
{
	log.debug("WEB-FLOW- Starting of the method initflow");
	order=new Order();
	log.debug("WEB-FLOW- The method initflow is executed");
	return order;
	
}

public String addShippingAddress(Order order, ShippingAddress shippingAddress)
{
	log.debug("Starting the method addShippingAddress");
	try {
		order.setShippingAddress(shippingAddress);
		log.debug("Ending the method addShippingAddress");
	} catch (Exception e) {
		e.printStackTrace();
		log.debug("Ending the method addShippingAddress");
		return "fail";
	}
	
	return "success";
	
}

public String addBillingAddress(Order order, BillingAddress billingAddress)
{
	log.debug("Starting the method addBillingAddress");
	try {
		order.setBillingAddress(billingAddress);
		log.debug("Ending the method addBillingAddress");
	} catch (Exception e) {
		e.printStackTrace();
		log.debug("Ending the method addShippingAddress");
		return "fail";
	}
	return "success";
	
}

public String addPaymentMethod(Order order, PaymentMethod paymentMethod)
{
	log.debug("Starting the method addPaymentMethod");
	try {
		order.setPaymentMethod(paymentMethod);
		log.debug("Ending the method addPaymentMethod");
	} catch (Exception e) {
		e.printStackTrace();
		log.debug("Ending the method addPaymentMethod");
	}
	log.debug("Ending the method addPaymentMethod");
	return "success";
	
}
}
