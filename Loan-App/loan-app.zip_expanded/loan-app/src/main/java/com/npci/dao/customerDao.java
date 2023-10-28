package com.npci.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.npci.beans.Customer;

public interface customerDao extends JpaRepository<Customer, Integer>{


	static Customer findCustomerByEmailAndPassword(String emailId, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	Customer checkCustomer(String emailId, String password);

}
