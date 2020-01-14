package com.deloitte.deloittespringboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deloitte.deloittespringboot.model.Product;
import com.deloitte.deloittespringboot.repo.ProductRepo;

@Service
public class ProductService {
   
	@Autowired
	ProductRepo repo;
	public Product saveProduct(Product product)
	{
		
		return repo.save(product);
		
	}
	public List<Product> getAllProducts(){
		return repo.findAll();
	}
	public Product getProduct(int pId)
	{
		return repo.getOne(pId);
	}
}
