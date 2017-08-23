package com.my.codingtest.validators;

import com.my.codingtest.dao.CustomerDao;
import com.my.codingtest.dao.impl.CustomerDaoImpl;
import com.my.codingtest.model.Customer;
import com.my.codingtest.model.dto.TradeDto;

public class CustomerValidate implements TradeValidator{
	
	CustomerDao customerDao = new CustomerDaoImpl();


	@Override
	public void validate(TradeDto tradeDto) {
		Customer customer = customerDao.getByName(tradeDto.getCustomer());		
		if(customer == null){			
			throw new IllegalArgumentException("Cant find a customer with name: "+tradeDto.getCustomer());
		}else{			
			if(!customer.isSupported()) 
				throw new IllegalArgumentException("Customer is not supported!");	
		}
	}
}
