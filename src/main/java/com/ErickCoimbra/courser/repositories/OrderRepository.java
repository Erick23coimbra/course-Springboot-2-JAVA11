package com.ErickCoimbra.courser.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ErickCoimbra.courser.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
