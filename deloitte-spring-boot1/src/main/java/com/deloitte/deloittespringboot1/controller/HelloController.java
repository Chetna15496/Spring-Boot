package com.deloitte.deloittespringboot1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.deloitte.deloittespringboot1.model.Product;
import com.deloitte.deloittespringboot1.service.ProductService;
import com.deloitte.deloittespringboot1.util.ProductNotFoundException;

@SuppressWarnings("unused")
@RestController//reset state of controller
public class HelloController {
//	@GetMapping("/hello")
//	public String sayHello(Model m) {
//		m.addAttribute("msg", "How are you?");
//		1//return "show.jsp";
//		return "show";//2
	
///////////////////////////////////////////////
	@Autowired
	ProductService service;
	
	@PostMapping("/products") //used to add
	public ResponseEntity<Product> saveProduct(@RequestBody Product product) {
		ResponseEntity<Product> productResponse=new ResponseEntity<Product>(service.saveProduct(product),HttpStatus.CREATED);
		return productResponse;
		
	}
	
	@GetMapping("/products") //used to fetch
	public List<Product> getAllProducts(){
		return service.getAllProducts();
	}
	
	@GetMapping("/products/{pId}")//after 2nd slash it becomes dynamic i.e. user will provide it
	public Product getProductById(@PathVariable("pId")int pId){
		return service.getProduct(pId);
	}
	
	@GetMapping("/products/name/{prodName}")//after 2nd slash it becomes dynamic i.e. user will provide it
	public Product findByproductName(@PathVariable("prodName")String pName){
		return service.findByprodName(pName);
	}
	
	@GetMapping("/products/name/{prodName}/price/{price}")//after 2nd slash it becomes dynamic i.e. user will provide it
	public Product getProductByNameAndPrice(@PathVariable("prodName")String pName, @PathVariable("price")float price){
		return service.findByprodNameandPrice(pName,price);
	}
	@GetMapping("/products/from/{from}/to/{to}")
	public List<Product> findProductInRange(@PathVariable("from") float fromRange, @PathVariable("to") float toRange){
		return service.findProductsInRange(fromRange, toRange);
		
	}
/////////////////////////////////////////////////////////////////////	
	/*@DeleteMapping("/products/{pId}")
	public ResponseEntity<Product> deleteProduct(@PathVariable int pId){
		ResponseEntity<Product> deleteProduct;
		if(service.checkIfExixts(pId)) {
		service.deleteProductById(pId);
		deleteProduct=new ResponseEntity<>(HttpStatus.OK);}
		else {
			deleteProduct=new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		return deleteProduct;
		
	}*/
///////////////////////////////////////////////////////////////////
	@DeleteMapping("/products/{pId}")
	public ResponseEntity<Product> deleteProduct(@PathVariable int pId){
		ResponseEntity<Product> deleteProduct;
		if(!service.checkIfExixts(pId)) {
			throw new ProductNotFoundException("pId: "+pId);
		}
	service.deleteProductById(pId);
	deleteProduct=new ResponseEntity<Product>(HttpStatus.OK);
	return deleteProduct;
	
	
	}
}
