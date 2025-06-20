package com.davidnadler.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.davidnadler.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
