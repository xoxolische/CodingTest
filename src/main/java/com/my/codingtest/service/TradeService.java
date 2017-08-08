package com.my.codingtest.service;

import javax.ws.rs.core.Response;

import com.my.codingtest.model.dto.TradeDto;

public interface TradeService {
	
	Response validate(TradeDto tradeDto);
	
}
