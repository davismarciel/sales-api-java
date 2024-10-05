package com.educandoweb.springboot_webservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.educandoweb.springboot_webservices.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	
	
	
}
