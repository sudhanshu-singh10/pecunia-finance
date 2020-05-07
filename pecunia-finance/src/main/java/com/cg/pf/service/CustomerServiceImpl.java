package com.cg.pf.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.pf.exception.ResourceNotFoundException;
import com.cg.pf.model.Customer;
import com.cg.pf.repository.CustomerRepository;

@Service

public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepository customerRepository;
	
	@Override
	public Customer createCustomer(Customer customer) {
		
		return customerRepository.save(customer);
	}

	@Override
	public Customer updateCustomer(Customer customer) {
		Optional<Customer> customerDb =this.customerRepository.findById(customer.getId());
		
		if (customerDb.isPresent()) {
			
			Customer customerUpdate= customerDb.get();
			customerUpdate.setName(customer.getName());
			customerUpdate.setAddress(customer.getAddress());
			customerUpdate.setCity(customer.getCity());
			customerUpdate.setContactNumber(customer.getContactNumber());
			customerUpdate.setCountry(customer.getCountry());
			customerUpdate.setState(customer.getState());
			customerUpdate.setZipCode(customer.getZipCode());
			customerRepository.save(customerUpdate);
			return customerUpdate;
			
		}
		else {
			
			throw new ResourceNotFoundException("record Not Found with id: " +customer.getId());
		}	
	}

	@Override
	public List<Customer> getAllCustomer() {
		
		return (List<Customer>) this.customerRepository.findAll();
	}

	@Override
	public Customer getCustomerById(long customerId) {
		
     Optional<Customer> customerDb =this.customerRepository.findById(customerId);
		
		if (customerDb.isPresent()) {
			return customerDb.get();
		}
		else {
			throw new ResourceNotFoundException("record Not Found with id: " +customerId);
		}
	}

	@Override
	public void deleteCustomer(long customerId) {
		   Optional<Customer> customerDb =this.customerRepository.findById(customerId);
			
			if (customerDb.isPresent()) {
				this.customerRepository.delete(customerDb.get());
			}
			else {
				throw new ResourceNotFoundException("record Not Found with id: " +customerId);
			}
		
	}

}
