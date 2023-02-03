package com.example.demo.dto;

import com.example.demo.entity.Customer;

public class OrderRequest {	
	
	private Customer customer;
	public OrderRequest()
	{
		
	}	
	public OrderRequest(Customer customer) {
		super();
		this.customer = customer;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
}
