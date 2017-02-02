package com.niit.shoppingcart.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

@Component
@ComponentScan("com.niit.shoppingcart")
@Entity
@Table(name="userorder")
public class Order implements Serializable {

	private static final long serialVersionUID = 1L;

@Id	
@GeneratedValue(strategy=GenerationType.SEQUENCE)
public int Order_id;

public int getOrder_id() {
	return Order_id;
}

public void setOrder_id(int order_id) {
	Order_id = order_id;
}

public String getProduct_Name() {
	return Product_Name;
}

public void setProduct_Name(String product_Name) {
	Product_Name = product_Name;
}

public int getProduct_price() {
	return Product_price;
}

public void setProduct_price(int product_price) {
	Product_price = product_price;
}

public String getUser_id() {
	return user_id;
}

public void setUser_id(String user_id) {
	this.user_id = user_id;
}

public PaymentMethod getPaymentMethod() {
	return paymentMethod;
}

public void setPaymentMethod(PaymentMethod paymentMethod) {
	this.paymentMethod = paymentMethod;
}

public ShippingAddress getShippingAddress() {
	return shippingAddress;
}

public void setShippingAddress(ShippingAddress shippingAddress) {
	this.shippingAddress = shippingAddress;
}

public BillingAddress getBillingAddress() {
	return billingAddress;
}

public void setBillingAddress(BillingAddress billingAddress) {
	this.billingAddress = billingAddress;
}

public static long getSerialversionuid() {
	return serialVersionUID;
}

public String Product_Name;

public int Product_price;

public String user_id;

@Autowired
public PaymentMethod paymentMethod;

@Autowired
public ShippingAddress shippingAddress;

@Autowired
public BillingAddress billingAddress;

}