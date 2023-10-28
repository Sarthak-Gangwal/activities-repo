package com.npci.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.npci.beans.Customer;
import com.npci.dao.customerDao;
import com.npci.exception.CustomerNotFoundException;

@Service("service")
public class customerServiceImpl implements customerService {

	@Autowired
	private customerDao dao;

	@Override
	public Customer saveCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return dao.save(customer);
	}

	@Override
	public Customer getCustomerById(int id) {
		// TODO Auto-generated method stub
		Optional<Customer> res = dao.findById(id);
		return dao.orElseThrow(() -> new CustomerNotFoundException("id "+id+" not found"));;
	}

	@Override
	public Customer loginCustomer(String emailId, String password) throws CustomerNotFoundException{
		customerDao res = Customer.login(String emailId, String password);
				if(res !=null) {
					return (Customer) res;
				}else {
					throws new CustomerNotFoundException("Customer Not Found")
				}
		// TODO Auto-generated method stub
		return res.orElseThrow() -> new CustomerNotFoundException("Not Found") ;
	}
	


}
