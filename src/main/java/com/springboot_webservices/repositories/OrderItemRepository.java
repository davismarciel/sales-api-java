package com.springboot_webservices.repositories;

import com.springboot_webservices.entities.OrderItem;
import com.springboot_webservices.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
}

