package com.websystique.springboot.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.websystique.springboot.model.Customer;
import com.websystique.springboot.repositories.CustomerRepository;

@Service("customerService")
@Transactional
public class MTServiceImpl implements MTService {

	public static final Logger logger = LoggerFactory.getLogger(MTServiceImpl.class);
	
	@Autowired
	private CustomerRepository customerRepository;

	
	@Override
	public Long customerVerifyReq(Customer customer) {
		
		logger.info(":: customerVerifyReq service impl ::");
		customer.setVerified(true);
		Customer cust = customerRepository.saveAndFlush(customer);
		System.out.println("cust after saved :: " + cust);
		return cust.getCustId();
	}

	@Override
	public Customer findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveCustomer(Customer customer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteCustomerById(String id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllCustomers() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Customer> findAllCustomer() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isCustomerExist(Customer user) {
		// TODO Auto-generated method stub
		return false;
	}

}
