package com.niit.shoppingcart.DAO;

import java.util.*;

import com.niit.shoppingcart.model.Supplier;

public interface SupplierDAO {

	
	public List <Supplier> list();
	
	public Supplier get(String id);
	
	public Supplier getName(String name);
	
	public Supplier validate(String id);
	
	public boolean save(Supplier supplier);
	
	public boolean update(Supplier supplier);
	
	public boolean delete(Supplier supplier);
	
	
		
	}

