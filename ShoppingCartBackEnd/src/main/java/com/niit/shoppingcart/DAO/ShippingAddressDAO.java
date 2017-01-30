package com.niit.shoppingcart.DAO;

import com.niit.shoppingcart.model.ShippingAddress;

public interface ShippingAddressDAO {

	public boolean save(ShippingAddress shippingAddress);
	
	public boolean delete(ShippingAddress shippingAddress);
	
	public ShippingAddress get(String id);
	
}
