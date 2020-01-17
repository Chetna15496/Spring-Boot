package com.deloitte.deloittespringboot1.controller;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.deloitte.deloittespringboot1.util.ErrorResponse;
import com.deloitte.deloittespringboot1.util.ProductNotFoundException;

@RestController
@ControllerAdvice
public class ProductErrorController extends ResponseEntityExceptionHandler{

	@ExceptionHandler(ProductNotFoundException.class)
	public ResponseEntity<ErrorResponse> handleNotFoundError(Exception ex,WebRequest req){
		ErrorResponse res=new ErrorResponse (new Date(),ex.getMessage(),req.getDescription(false));
	     return new ResponseEntity<ErrorResponse>(res,HttpStatus.NOT_FOUND);
	}
	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorResponse> handleAllError(Exception ex,WebRequest req){
		ErrorResponse res=new ErrorResponse (new Date(),ex.getMessage(),req.getDescription(false));
	     return new ResponseEntity<ErrorResponse>(res,HttpStatus.BAD_REQUEST);}
}
