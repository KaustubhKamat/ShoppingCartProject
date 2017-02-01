package com.niit.shoppingcart.model;

import java.io.Serializable;

import javax.persistence.Entity;

import org.springframework.stereotype.Component;

@Component
@Entity
public class PaymentMethod implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String paymentmethod;

	public String getPaymentMethod() {
		return paymentmethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		paymentmethod = paymentMethod;
	}
	
	@Override
	public String toString()
	{
		return paymentmethod;
		
	}
	
}
