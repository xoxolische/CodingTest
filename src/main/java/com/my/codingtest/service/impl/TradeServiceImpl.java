package com.my.codingtest.service.impl;

import java.util.Calendar;

import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.my.codingtest.model.Customer;
import com.my.codingtest.model.dto.TradeDto;
import com.my.codingtest.model.enums.CCYPair;
import com.my.codingtest.service.CustomerService;
import com.my.codingtest.service.TradeService;

@Service
public class TradeServiceImpl implements TradeService{
	
	@Autowired
	CustomerService customerService;

	@Override
	public Response validate(TradeDto tradeDto) {
		
		//Check if valuDate before tradeDate
		if(tradeDto.getValueDate() != null && tradeDto.getTradeDate() != null) {			
			if(!tradeDto.getTradeDate().before(tradeDto.getValueDate())) return Response.status(Response.Status.NOT_ACCEPTABLE).entity("ValueDate cant be before TradeDate!").build();
		}
		
		//Check if valueDate is not Sunday or Saturday
		if(tradeDto.getValueDate() != null) {
			Calendar c = Calendar.getInstance();
			c.setTime(tradeDto.getValueDate());
			int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);	
			
			if(dayOfWeek == 6 || dayOfWeek == 7) return Response.status(Response.Status.NOT_ACCEPTABLE).entity("ValueDate cant be Sunday or Saturday!").build();
		}
		/*Check if customer is supported
		 *Customer entity has name field
		 *Let`s say it`s uniq so we can search in db by name
		 *Then we check if customer`s field supported is true
		 */
		Customer customer = customerService.getByName(tradeDto.getCustomer());
		if(customer == null) return Response.status(Response.Status.NOT_FOUND).entity("Cant find a customer with name: "+tradeDto.getCustomer()).build();
		if(!customer.isSupported()) return Response.status(Response.Status.NOT_ACCEPTABLE).entity("Customer is not supported!").build();;
		
		//Check if currencies are valid
		if(tradeDto.getValueDate() != null) {			
			if(tradeDto.getCcyPair().equals(CCYPair.EURUSD.name()) || tradeDto.getCcyPair().equals(CCYPair.USDEUR.name())) return Response.status(Response.Status.NOT_ACCEPTABLE).entity("Currencies are invalid!").build();
		}
		
		return Response.ok().entity("Validation successful!").build();
		
	}
		
}
