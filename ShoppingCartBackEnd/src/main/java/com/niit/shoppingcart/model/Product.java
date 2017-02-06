package com.niit.shoppingcart.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.Cascade;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Entity
@Table
@Component
public class Product {

@Id
@Column(name="id",unique=true)
public String id;
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public String getCategory_id() {
	return category_id;
}
public void setCategory_id(String category_id) {
	this.category_id = category_id;
}
public String getSupplier_id() {
	return supplier_id;
}
public void setSupplier_id(String supplier_id) {
	this.supplier_id = supplier_id;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public String getStock() {
	return stock;
}
public void setStock(String stock) {
	this.stock = stock;
}
public String name;
public String description;
public String category_id;
public String supplier_id;
public int price;
public String stock;

@ManyToOne
@JoinColumn(name="category_id",updatable=false, insertable=false, nullable=false)
public Category category;

public Category getCategory() {
	return category;
}
public void setCategory(Category category) {
	this.category = category;
}
public Supplier getSupplier() {
	return supplier;
}
public void setSupplier(Supplier supplier) {
	this.supplier = supplier;
}

@ManyToOne(cascade=CascadeType.ALL)
@JoinColumn(name="supplier_id",updatable=false,insertable=false,nullable=false)
public Supplier supplier;

@Transient
public MultipartFile image;
public MultipartFile getImage()
{
	return image;
	
}
public void setImage(MultipartFile image)
{
	this.image=image;
}


}
