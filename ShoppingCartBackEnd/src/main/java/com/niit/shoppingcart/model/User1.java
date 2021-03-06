package com.niit.shoppingcart.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.stereotype.Component;

@Entity
@Table
@Component // to create the object/instance such as User1 u=new User();
public class User1 {

	// write the properties same as db table fields
	
	   /* While using hibernate we need one Id key for each table. This id key is mentioned above emaild so
	         the system will know that the email id is primary key.*/
	@Id
	@Column(unique=true, nullable=false)
	public String Emailid;
	public String getEmailid() {
		return Emailid;
	}
	public void setEmailid(String emailid) {
		Emailid = emailid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	@NotEmpty(message="This field cannot be kept empty")
	public String name;
	
	@Size(min=5 , max=12)
	public String password;
	public String mobile;
	public String role;
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	
	
}	
	

