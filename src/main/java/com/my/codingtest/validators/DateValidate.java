package com.my.codingtest.validators;

import java.util.Calendar;
import com.my.codingtest.model.dto.TradeDto;

public class DateValidate implements TradeValidator{
	private static Calendar calendar;

	@Override
	public void validate(TradeDto tradeDto) {
		if(tradeDto.getValueDate() != null && tradeDto.getTradeDate() != null) {			
			if(!tradeDto.getTradeDate().before(tradeDto.getValueDate())) 
				throw new IllegalArgumentException("ValueDate cant be before TradeDate!");		
		
			calendar = Calendar.getInstance();
			calendar.setTime(tradeDto.getValueDate());
			int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);	
			
			if(dayOfWeek == 6 || dayOfWeek == 7) 
				throw new IllegalArgumentException("ValueDate cant be Sunday or Saturday!");
		}else{
			throw new NullPointerException("ValueDate and TradeDate cant be null!");
		}
	}

}
