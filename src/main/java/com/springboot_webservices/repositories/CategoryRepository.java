package com.springboot_webservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot_webservices.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long>{
	
}
