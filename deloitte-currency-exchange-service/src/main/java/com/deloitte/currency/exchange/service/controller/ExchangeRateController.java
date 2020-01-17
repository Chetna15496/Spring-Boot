package com.deloitte.currency.exchange.service.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.deloitte.currency.exchange.service.model.ExchangeRate;
import com.deloitte.currency.exchange.service.repo.ExchangeRepo;

@RestController
public class ExchangeRateController {
    
	@Autowired
	ExchangeRepo repo;
	@Autowired
	Environment env;
	
	@GetMapping("/exchange/from/{from}/to/{to}")
	public ResponseEntity<ExchangeRate> getExchangeRate(@PathVariable("from") String from,@PathVariable("to")String to){
		int port=Integer.parseInt(env.getProperty("local.server.port"));
		ExchangeRate eRate= repo.findByFromCurAndToCur(from,to);
		if(eRate==null) {
			return new ResponseEntity<ExchangeRate>(HttpStatus.NOT_FOUND);
		}
		eRate.setPort(port);
		return new ResponseEntity<ExchangeRate>(eRate,HttpStatus.OK);
		
	}
}
