package com.springboot_webservices.services;

import java.util.List;
import java.util.Optional;

import com.springboot_webservices.services.exceptions.DatabaseException;
import com.springboot_webservices.services.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import com.springboot_webservices.entities.User;
import com.springboot_webservices.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	public User findById(Long id) {
		Optional<User> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ResourceNotFoundException(id));
	}

	public User insert(User obj) {
		return repository.save(obj);
	}

	public void delete(Long id) {
		try {
			// Se id não existe
			if(!repository.existsById(id)) {
				throw new ResourceNotFoundException(id);
			}
			// Se existe, delete
			repository.deleteById(id);
		}
		// Se o id está atribuido a algum objeto
		catch (DataIntegrityViolationException e) {
			throw new DatabaseException();
		}
	}

	public List<User> findAll() {
		return repository.findAll();
	}

	public User update(Long id, User obj) {
		User entity = repository.getReferenceById(id);
		updateData(entity, obj);
		return repository.save(entity);
	}

	private void updateData(User entity, User obj) {
		entity.setName(obj.getName());
		entity.setEmail(obj.getEmail());
		entity.setPhone(obj.getPhone());
	}
}
