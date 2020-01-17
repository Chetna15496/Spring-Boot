package com.deloitte.currency.exchange.service.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.deloitte.currency.exchange.service.model.ExchangeRate;

public interface ExchangeRepo extends JpaRepository<ExchangeRate, Integer> {

	//@Query("from ExchangeRate where fromCur=:fromCur and toCur=:toCur")
	ExchangeRate findByFromCurAndToCur(String fromCur,String toCur);
	
}
