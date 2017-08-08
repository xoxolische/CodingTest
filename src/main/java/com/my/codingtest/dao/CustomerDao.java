package com.my.codingtest.dao;

import com.my.codingtest.model.Customer;

public interface CustomerDao{

	Customer getByName(String name);
}
