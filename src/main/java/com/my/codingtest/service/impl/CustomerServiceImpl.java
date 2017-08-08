package com.my.codingtest.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.my.codingtest.dao.CustomerDao;
import com.my.codingtest.model.Customer;
import com.my.codingtest.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService{
	@Autowired
	CustomerDao customerDao;

	@Override
	public Customer getByName(String name) {
		return customerDao.getByName(name);
	}

}
