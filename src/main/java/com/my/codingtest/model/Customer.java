package com.my.codingtest.model;

public class Customer {
	
	private long id;
	
	private String name;
	
	private boolean supported;
	
	public Customer(int id, String name, boolean supported){
		this.id = id;
		this.name = name;
		this.supported = supported;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isSupported() {
		return supported;
	}

	public void setSupported(boolean supported) {
		this.supported = supported;
	}		

}
