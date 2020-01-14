package com.deloitte.deloittespringboot.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.deloitte.deloittespringboot.model.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product,Integer> {

	
}
