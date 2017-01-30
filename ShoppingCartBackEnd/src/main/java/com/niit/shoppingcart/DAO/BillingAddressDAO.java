package com.niit.shoppingcart.DAO;

import com.niit.shoppingcart.model.BillingAddress;

public interface BillingAddressDAO {

public boolean save(BillingAddress billingAddress);
	
	public boolean delete(BillingAddress billingAddress);
	
	public BillingAddress get(String id);
}
