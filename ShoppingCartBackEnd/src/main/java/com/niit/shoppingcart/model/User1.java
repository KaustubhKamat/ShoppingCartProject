package com.niit.shoppingcart.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import org.springframework.stereotype.Component;

@Entity
@Table
@Component // to create the object/instance such as User1 u=new User();
public class User1 {

	// write the properties same as db table fields
	
	   /* While using hibernate we need one Id key for each table. This id key is mentioned above emaild so
	         the system will know that the email id is primary key.*/
	@Id
	public String Emailid;
	public String name;
	public String password;
	public String mobile;
	
}	
	

