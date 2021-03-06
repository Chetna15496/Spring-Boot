
  package com.deloitte.currency.conversion.service.controller;
  
  import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.deloitte.currency.conversion.service.model.ConversionBean;
  
  @FeignClient(value="deloitte-currency-exchange-service")//,url="http://localhost:8500")
  @RibbonClient(value="deloitte-currency-exchange-service")
  public interface ExchangeServiceProxy {
	  
      @GetMapping("/exchange/from/{from}/to/{to}")
	  public ResponseEntity<ConversionBean> getExchangeValue(@PathVariable("from")String from,@PathVariable("to")String to);
  }
 