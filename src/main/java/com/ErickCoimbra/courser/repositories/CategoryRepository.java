package com.ErickCoimbra.courser.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ErickCoimbra.courser.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
