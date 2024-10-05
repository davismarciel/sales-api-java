package com.educandoweb.springboot_webservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.educandoweb.springboot_webservices.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long>{
	
}
