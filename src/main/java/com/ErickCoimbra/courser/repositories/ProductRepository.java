package com.ErickCoimbra.courser.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ErickCoimbra.courser.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
