package com.ErickCoimbra.courser.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ErickCoimbra.courser.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
