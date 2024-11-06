package com.springboot_webservices.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot_webservices.entities.Order;
import com.springboot_webservices.repositories.OrderRepository;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepository repository;

	public Order insert(Order obj) {
		return repository.save(obj);
	}

	public Order findById(Long id) {
		Optional<Order> obj = repository.findById(id);
		return obj.get();
	}
	
	public List<Order> findAll() {
		return repository.findAll();
	}
}
