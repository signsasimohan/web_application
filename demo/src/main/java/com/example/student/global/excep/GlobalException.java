package com.example.student.global.excep;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.example.student.custom.expception.CustomExceptions;

public class GlobalException {
	@ExceptionHandler(CustomExceptions.class)
	public ResponseEntity<Object>AgeHandle(CustomExceptions c){
		
		return new ResponseEntity<>(c.getMessage(),HttpStatus.NOT_FOUND);	
		
	}

}
