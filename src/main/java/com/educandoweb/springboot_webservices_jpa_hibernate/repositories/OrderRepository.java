package com.educandoweb.springboot_webservices_jpa_hibernate.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.educandoweb.springboot_webservices_jpa_hibernate.entities.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long>{
	
	
	
}
