package com.example.demo.controller;

import java.util.List;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.OrderRequest;
import com.example.demo.dto.OrderResponse;
import com.example.demo.entity.Customer;
import com.example.demo.repository.CustomerRepository;
import com.example.demo.repository.ProductRepository;

import ch.qos.logback.classic.Logger;

@RestController
public class OrderController {
	Logger log = (Logger) LoggerFactory.getLogger(OrderController.class);
	@Autowired
	private CustomerRepository customerRepository;
	@Autowired
	private ProductRepository productRepository;

	@PostMapping("/postall")
	public Customer placeorder(@RequestBody OrderRequest request) {
		log.info("Setting the values");
		return customerRepository.save(request.getCustomer());	
	}
	@GetMapping("/findall")
	public List<Customer> findAllOrders(){
		log.info("Getting the values");
		return customerRepository.findAll();
	}
	
	@GetMapping("/getall")
	public List<OrderResponse> getjioninfo(){
		log.info("Getting jion values");
		return customerRepository.getJoinInfo();
	}
}
