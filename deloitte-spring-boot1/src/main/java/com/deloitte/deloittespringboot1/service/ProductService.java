package com.deloitte.deloittespringboot1.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deloitte.deloittespringboot1.model.Product;
import com.deloitte.deloittespringboot1.repo.ProductRepo;

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
	public void deleteProductById(int pId) {
		repo.deleteById(pId);
		
	}
	public boolean checkIfExixts(int pId) {
		return repo.existsById(pId);
	}
	public Product findByprodName(String pName) {
		return repo.findByprodName(pName);
	}
	public Product findByprodNameandPrice(String pName,float price) {
		return repo.findByprodNameAndPrice(pName, price);
	}
	public List<Product> findProductsInRange(float from,float to){
		return repo.findProductsInRange(from, to);
	}
}
