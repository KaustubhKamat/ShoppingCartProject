package com.niit.shoppingcart.DAO;

import com.niit.shoppingcart.model.Order;

public interface OrderDAO {

	public boolean saveOrder(Order order);
	
	public boolean deleteOrder(Order order);
	
	public Order get(int id);
}
