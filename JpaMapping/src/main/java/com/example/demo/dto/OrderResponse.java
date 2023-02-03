package com.example.demo.dto;

public class OrderResponse {

	private String name;
	private String productName;
	
	
	public OrderResponse() {
		
	}
	
	public OrderResponse(String name, String productName) {
		super();
		this.name = name;
		this.productName = productName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	
		
}
