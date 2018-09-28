package com.example.swagger.swaggerdemo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
@Api(value="SampleService", description="Operation of Sample Service")
public class controller
{
	@ApiOperation(value = "Get JSON and XML output", response = String.class)
	@RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<Object> demo() 
	{
		System.out.println("Inside demo");
		return new ResponseEntity<Object>("Done", HttpStatus.OK);
    }
}