package com.my.codingtest.dao.impl;

import org.springframework.stereotype.Repository;

import com.my.codingtest.dao.CustomerDao;
import com.my.codingtest.model.Customer;

@Repository
public class CustomerDaoImpl implements CustomerDao{

	@Override
	public Customer getByName(String name) {
		// Take data from database
		return (name.equals("PLUTO1")) ? new Customer(1, "PLUTO1", true) : (name.equals("PLUTO2")) ? new Customer(1, "PLUTO2", false) : null;
	}

	
}
