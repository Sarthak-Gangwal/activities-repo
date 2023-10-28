package com.npci.service;

import com.npci.beans.Customer;

public interface customerService {

	//register
	//login
	//get by id
	

	public Customer saveCustomer(Customer customer);
	public Customer getCustomerById(int customer);
	public Customer loginCustomer(String emailId, String password);


}
