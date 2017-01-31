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

	public String PaymentMethod;

	public String getPaymentMethod() {
		return PaymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		PaymentMethod = paymentMethod;
	}
	
	@Override
	public String toString()
	{
		return PaymentMethod;
		
	}
	
}
