package com.niit.shoppingcart.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Component
@Table(name="cart")
public class Cart implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	public Long id;
	
	@Column
	public String emailid;

	@Column
	public String Total_Price;
	
	public String getTotal_Price() {
		return Total_Price;
	}

	public void setTotal_Price(String total_Price) {
		Total_Price = total_Price;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}


	public String product_name;
	
	
	
	public String Quantity;

	public String getQuantity() {
		return Quantity;
	}

	public void setQuantity(String quantity) {
		Quantity = quantity;
	}
	
	
}
