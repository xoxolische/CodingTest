package com.my.codingtest.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.springframework.stereotype.Service;

import com.my.codingtest.model.dto.TradeDto;
import com.my.codingtest.service.TradeService;
import com.my.codingtest.validators.CCYPairValidate;
import com.my.codingtest.validators.CustomerValidate;
import com.my.codingtest.validators.DateValidate;
import com.my.codingtest.validators.TradeValidator;

@Service
public class TradeServiceImpl implements TradeService{
	
	@Override
	public Response validate(TradeDto tradeDto) {
		List<TradeValidator> rules = new ArrayList<>();
		
		rules.add(new CCYPairValidate());
		rules.add(new CustomerValidate());
		rules.add(new DateValidate());
		
		for(TradeValidator rule : rules){
			try{
				rule.validate(tradeDto);				
			}catch(IllegalArgumentException e){
				return Response.status(Status.NOT_ACCEPTABLE).entity(e.getMessage()).build();
			}
		}		
		return Response.ok().entity("Validation successful!").build();
		
	}
		
}
