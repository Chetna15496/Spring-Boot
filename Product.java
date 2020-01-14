package com.deloitte.deloittespringboot.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {

	@Id 
	@GeneratedValue(strategy=GenerationType.AUTO)//auto increment/creation of Id
	int prodId;
	String prodName;
	float price;
	LocalDate releasedDate;
	
   public Product() {
		
	}

public Product(int prodId, String prodName, float price, LocalDate releasedDate) {
	super();
	//this.prodId = prodId;//by default creation
	this.prodName = prodName;
	this.price = price;
	this.releasedDate = releasedDate;
}

public int getProdId() {
	return prodId;
}

public void setProdId(int prodId) {
	this.prodId = prodId;
}

public String getProdName() {
	return prodName;
}

public void setProdName(String prodName) {
	this.prodName = prodName;
}

public float getPrice() {
	return price;
}

public void setPrice(float price) {
	this.price = price;
}

public LocalDate getReleasedDate() {
	return releasedDate;
}

public void setReleasedDate(LocalDate releasedDate) {
	this.releasedDate = releasedDate;
}

@Override
public String toString() {
	return "Product [prodId=" + prodId + ", prodName=" + prodName + ", price=" + price + ", releasedDate="
			+ releasedDate + "]";
}
   
}
