package com.educandoweb.springboot_webservices_jpa_hibernate.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.springboot_webservices_jpa_hibernate.entities.User;
import com.educandoweb.springboot_webservices_jpa_hibernate.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	public User findById(Long id) {
		Optional<User> obj = repository.findById(id);
		return obj.get();
	}
	
	public List<User> findAll() {
		return repository.findAll();
	}
}
