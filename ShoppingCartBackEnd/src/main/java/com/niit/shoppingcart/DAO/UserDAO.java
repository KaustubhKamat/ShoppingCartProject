package com.niit.shoppingcart.DAO;

import java.util.*;

import com.niit.shoppingcart.model.User1;

public interface UserDAO {/*// we require access specifier as public because if not specified it will 
	consider default so we cannot take that in other package.*/
// we have to specify what method need to implement in other classes
	//Just only declare what to do
	//What type of operations we require in DAO
	//CRUD operations + validations
	//method signature
	//access_specifier return_type methodName(parameter_list)

	
	//get all users by using list. if anyone calls list we will return the list of users objects so using list.
	public List<User1> list();
	
	//getting user based on id
	
	public User1 get(String Emailid);
	//checking whether the credentials are valid or not
	
	
	//This method will return user, else will return null
	public User1 validate(String Emailid, String password);
	
	//save Method. If it is successfully saved then it will show true and else false.
	
	public boolean save(User1 user);//
	
	//update Method. if it successfully updated then it will show true and else false.
	
	public boolean update(User1 user);
	
	
	



}
