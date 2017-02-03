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
	public String id;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUser_Id() {
		return User_Id;
	}

	public void setUser_Id(String user_Id) {
		User_Id = user_Id;
	}

	public String getProduct_Name() {
		return Product_Name;
	}

	public void setProduct_Name(String product_Name) {
		Product_Name = product_Name;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getQuantity() {
		return Quantity;
	}

	public void setQuantity(String quantity) {
		Quantity = quantity;
	}

	public Date getDate_Added() {
		return Date_Added;
	}

	public void setDate_Added(Date date_Added) {
		Date_Added = date_Added;
	}

	public String User_Id;
	
	public String Product_Name;

	public String price;
	
	public String status;
	
	public String Quantity;
	
	@Column(name="Date")
	public Date Date_Added;
}
