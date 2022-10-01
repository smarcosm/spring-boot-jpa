package com.smarcosm.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.smarcosm.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
