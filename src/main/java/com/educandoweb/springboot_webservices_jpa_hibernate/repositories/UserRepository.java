package com.educandoweb.springboot_webservices_jpa_hibernate.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.springboot_webservices_jpa_hibernate.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	
	
}
