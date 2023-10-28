package com.npci.exception;

@SuppressWarnings("serial")
public class CustomerAlreadyRegister extends RuntimeException{
	
	public CustomerAlreadyRegister(String message) {
		super(message);
	}

}
