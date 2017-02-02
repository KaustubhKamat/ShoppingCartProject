package com.niit.shoppingcart.DAO;

import java.util.*;

import com.niit.shoppingcart.model.Cart;

public interface CartDAO {

	public List<Cart> list(String id);
	
	public boolean SaveCart(Cart cart);
	
	public boolean DeleteCart(String id);
	
	public boolean UpdateCart(Cart cart);
	
	public Integer getMaxId();
	
	public boolean deleteByCartId(Cart cart);
	
	public Cart get(String id);
	
	public long getTotalAmount(String id);
	
	
}
