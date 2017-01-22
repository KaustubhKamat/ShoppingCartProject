package com.niit.shoppingcart.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.stereotype.Component;

@Component
@Entity
public class ShippingAddress implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	public String ShippingAddressId;
	
	public String getShippingAddressId() {
		return ShippingAddressId;
	}

	public void setShippingAddressId(String shippingAddressId) {
		ShippingAddressId = shippingAddressId;
	}

	public String getLine1() {
		return Line1;
	}

	public void setLine1(String line1) {
		Line1 = line1;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@NotBlank(message="Please enter the address")
	public String Line1;
	
	@NotBlank(message="Please enter the city name")
	public String city;
	
	@NotBlank(message="Please enter the country name")
	public String country;
	
	@NotBlank(message="Please enter the pincode")
	public String pincode;
	
	public String toString()
	{
		return Line1 + "," + city + "," + country +"," + pincode ;
		
	}
	
}
