package com.BeanValidator.ControllerAdvise;

import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.BeanValidator.exception.StudentnofoundException;

@RestControllerAdvice
public class StudentExceptionHandler {

	@ExceptionHandler
	@ResponseStatus(value = HttpStatus.BAD_REQUEST)
	public ResponseEntity<Map<String,String>> handlingmethod(StudentnofoundException studentnofoundException){
		
		Map<String,String> errorMap= new LinkedHashMap<>();
		errorMap.put("Message", studentnofoundException.getMessage());
		errorMap.put("Time", new Date().toString());
		
		return new ResponseEntity<Map<String,String>>(errorMap, HttpStatus.BAD_REQUEST);
	}
}
