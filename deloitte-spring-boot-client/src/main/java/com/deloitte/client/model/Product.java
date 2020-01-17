package com.deloitte.client.model;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

public class Product {

	int prodId;
	String prodName;
	float price;
	@DateTimeFormat(pattern="yyyy-MM-dd")
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
