package com.my.codingtest.validators;

import com.my.codingtest.model.dto.TradeDto;
import com.my.codingtest.model.enums.CCYPair;

public class CCYPairValidate implements TradeValidator{

	@Override
	public void validate(TradeDto tradeDto) {
		if(tradeDto.getValueDate() != null) {			
			//if(CCYPair.EURUSD.name().equals(tradeDto.getCcyPair()) && CCYPair.USDEUR.name().equals(tradeDto.getCcyPair())) 
			if(!tradeDto.getCcyPair().equals(CCYPair.EURUSD.name()))	
				throw new IllegalArgumentException("Wrong CCY pair");
		}		
	}

}
