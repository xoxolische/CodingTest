package com.my.codingtest.model.dto;

import java.util.Date;

import com.my.codingtest.model.enums.CCYPair;
import com.my.codingtest.model.enums.DirectionEnum;

public class TradeDto {
	
	private String customer;
	
	private CCYPair ccyPair;
	
	private String type;
	
	private DirectionEnum direction;
	
	private Date tradeDate;
	
	private double amount1;
	
	private double amount2;
	
	private float rate;
	
	private Date valueDate;
	
	private String legalEntity;
	
	private String trader;

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public CCYPair getCcyPair() {
		return ccyPair;
	}

	public void setCcyPair(CCYPair ccyPair) {
		this.ccyPair = ccyPair;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public DirectionEnum getDirection() {
		return direction;
	}

	public void setDirection(DirectionEnum direction) {
		this.direction = direction;
	}

	public Date getTradeDate() {
		return tradeDate;
	}

	public void setTradeDate(Date tradeDate) {
		this.tradeDate = tradeDate;
	}

	public double getAmount1() {
		return amount1;
	}

	public void setAmount1(double amount1) {
		this.amount1 = amount1;
	}

	public double getAmount2() {
		return amount2;
	}

	public void setAmount2(double amount2) {
		this.amount2 = amount2;
	}

	public float getRate() {
		return rate;
	}

	public void setRate(float rate) {
		this.rate = rate;
	}

	public Date getValueDate() {
		return valueDate;
	}

	public void setValueDate(Date valueDate) {
		this.valueDate = valueDate;
	}

	public String getLegalEntity() {
		return legalEntity;
	}

	public void setLegalEntity(String legalEntity) {
		this.legalEntity = legalEntity;
	}

	public String getTrader() {
		return trader;
	}

	public void setTrader(String trader) {
		this.trader = trader;
	}
		
	

}
