package com.niit.shoppingcart.DAO;

import java.util.List;

import com.niit.shoppingcart.model.Employee_Test;


public interface Employee_TestDAO {

public List <Employee_Test> list();
	
	public Employee_Test get(String id);
	
	public boolean save(Employee_Test employee);
	
	public boolean update(Employee_Test employee);
	
	public boolean delete(Employee_Test employee);
	




}
