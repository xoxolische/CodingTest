package com.my.codingtest.controller.api;

import javax.ws.rs.core.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.my.codingtest.model.dto.TradeDto;
import com.my.codingtest.service.TradeService;

@RestController
public class TradeControllerRest {
	@Autowired
	TradeService tradeService;
	
	@RequestMapping("/create")
	public Response createTrade(@RequestBody TradeDto tradeDto) {	
		return tradeService.validate(tradeDto);
	}

}
