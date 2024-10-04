package com.educandoweb.springboot_webservices_jpa_hibernate.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.springboot_webservices_jpa_hibernate.entities.Order;
import com.educandoweb.springboot_webservices_jpa_hibernate.repositories.OrderRepository;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepository repository;
	
	public Order findById(Long id) {
		Optional<Order> obj = repository.findById(id);
		return obj.get();
	}
	
	public List<Order> findAll() {
		return repository.findAll();
	}
}
