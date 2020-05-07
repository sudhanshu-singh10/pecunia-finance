package com.cg.pf.service;

import java.util.List;

import com.cg.pf.model.Customer;

public interface CustomerService {
	
	Customer createCustomer(Customer customer);
	Customer updateCustomer(Customer customer);
	List<Customer> getAllCustomer();
	Customer getCustomerById(long customerId);
	void deleteCustomer(long id);
	

}
