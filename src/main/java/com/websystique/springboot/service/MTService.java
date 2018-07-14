package com.websystique.springboot.service;

import java.util.List;

import com.websystique.springboot.model.Customer;

public interface MTService {

	public Long customerVerifyReq(Customer customer);
	Customer findById(Long id);

	Customer findByName(String name);

	void saveCustomer(Customer customer);

	void updateCustomer(Customer customer);

	void deleteCustomerById(String id);

	void deleteAllCustomers();

	List<Customer> findAllCustomer();

	boolean isCustomerExist(Customer user);
	
}
