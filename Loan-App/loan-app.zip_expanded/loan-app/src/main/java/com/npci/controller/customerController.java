package com.npci.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.npci.beans.Customer;
import com.npci.service.customerService;

@RestController
@RequestMapping("/api")
public class customerController {

	@Autowired
	private customerService service;

	@PostMapping(path = "/register", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> saveProfile(@RequestBody Customer customer) {
		Customer c = service.saveCustomer(customer);
		return ResponseEntity.status(200).body(c);
		
	@PostMapping(path = "/login")
	public String login()
	}

}
