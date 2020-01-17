package com.deloitte.currency.conversion.service.model;

public class ConversionBean {
private int id;
private String fromCur;
private String toCur;
private float exchangeValue;
private int port;
private float quantity;
private float total;
public ConversionBean() {
	// TODO Auto-generated constructor stub
}
public ConversionBean(int id, String fromCur, String toCur, float exchangeValue, int port, float quantity,float total) {
	super();
	this.id = id;
	this.fromCur = fromCur;
	this.toCur = toCur;
	this.exchangeValue = exchangeValue;
	this.port = port;
	this.quantity = quantity;
	this.total = total;
}

public float getTotal() {
	return total;
}
public void setTotal(float total) {
	this.total = total;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getFromCur() {
	return fromCur;
}
public void setFromCur(String fromCur) {
	this.fromCur = fromCur;
}
public String getToCur() {
	return toCur;
}
public void setToCur(String toCur) {
	this.toCur = toCur;
}
public float getExchangeValue() {
	return exchangeValue;
}
public void setExchangeValue(float exchangeValue) {
	this.exchangeValue = exchangeValue;
}
public int getPort() {
	return port;
}
public void setPort(int port) {
	this.port = port;
}
public float getQuantity() {
	return quantity;
}
public void setQuantity(float quantity) {
	this.quantity = quantity;
}

}
