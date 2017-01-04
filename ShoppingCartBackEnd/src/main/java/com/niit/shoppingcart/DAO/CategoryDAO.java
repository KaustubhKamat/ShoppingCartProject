package com.niit.shoppingcart.DAO;

import java.util.*;

import com.niit.shoppingcart.model.Category;

public interface CategoryDAO {

	public List<Category> list();
	
	public Category get(String Emailid);
	
	public Category validate(String Emailid);
	
	public boolean save(Category category);
	
	public boolean update(Category category);
	
	
}
