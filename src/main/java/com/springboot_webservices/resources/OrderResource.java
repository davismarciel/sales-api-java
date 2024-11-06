package com.springboot_webservices.resources;

import java.net.URI;
import java.util.List;

import com.springboot_webservices.entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import com.springboot_webservices.entities.Order;
import com.springboot_webservices.services.OrderService;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
@RequestMapping(value = "/orders")
public class OrderResource {
	@Autowired
	private OrderService service;

	@PostMapping
	public ResponseEntity<Order> insert(@RequestBody @Validated Order obj) {
		obj = service.insert(obj);
		URI uri = ServletUriComponentsBuilder
				.fromCurrentRequest().path("/")
				.buildAndExpand(obj.getId())
				.toUri();

		return ResponseEntity.created(uri).body(obj);
	}

	@GetMapping
	public ResponseEntity<List<Order>> findAll() {
		List<Order> list = service.findAll();

		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Order> findById(@PathVariable Long id) {
		Order obj = service.findById(id);
		
		return ResponseEntity.ok().body(obj);
		
	}

}
