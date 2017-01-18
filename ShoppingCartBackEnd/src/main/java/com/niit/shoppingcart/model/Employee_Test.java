package com.niit.shoppingcart.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Entity
@Component
public class Employee_Test {
	

	 @Id
	 private String id;

	 @Column
	 private String firstName;

	 @Column
	 private String lastName;

	 private String email;
	 private String phone;

	 public String getId() {
	  return id;
	 }

	 public void setId(String id) {
	  this.id = id;
	 }

	 public String getFirstName() {
	  return firstName;
	 }

	 public void setFirstName(String firstName) {
	  this.firstName = firstName;
	 }

	 public String getLastName() {
	  return lastName;
	 }

	 public void setLastName(String lastName) {
	  this.lastName = lastName;
	 }

	 public String getEmail() {
	  return email;
	 }

	 public void setEmail(String email) {
	  this.email = email;
	 }

	 public String getPhone() {
	  return phone;
	 }

	 public void setPhone(String phone) {
	  this.phone = phone;
	 }

	}



