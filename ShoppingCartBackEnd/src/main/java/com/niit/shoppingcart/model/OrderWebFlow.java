package com.niit.shoppingcart.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
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

}
