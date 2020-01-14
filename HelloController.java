package com.deloitte.deloittespringboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.deloitte.deloittespringboot.model.Product;
import com.deloitte.deloittespringboot.service.ProductService;

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
	public Product saveProduct(Product product) {
		return service.saveProduct(product);
		
	}
	
	@GetMapping("/products") //used to fetch
	public List<Product> getAllProducts(){
		return service.getAllProducts();
	}
	
	@GetMapping("/products/{pId}")//after 2nd slash it becomes dynamic i.e. user will provide it
	public Product getAllProducts(@PathVariable("pId")int pId){
		return service.getProduct(pId);
	}
	
	
	}


