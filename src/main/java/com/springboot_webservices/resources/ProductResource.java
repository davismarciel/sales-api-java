package com.springboot_webservices.resources;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import com.springboot_webservices.entities.Product;
import com.springboot_webservices.services.ProductService;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
@RequestMapping(value = "/products")
public class ProductResource {
	@Autowired
	private ProductService service;

	@PostMapping
	public ResponseEntity<Product> insert(@RequestBody @Validated Product obj) {
		obj = service.insert(obj);
		URI uri = ServletUriComponentsBuilder
				.fromCurrentRequest().path("/")
				.buildAndExpand(obj.getId())
				.toUri();

		return ResponseEntity.created(uri).body(obj);
	}

	@GetMapping
	public ResponseEntity<List<Product>> findAll() {
		List<Product> list = service.findAll();

		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Product> findById(@PathVariable Long id) {
		Product obj = service.findById(id);
		
		return ResponseEntity.ok().body(obj);
	}

}
