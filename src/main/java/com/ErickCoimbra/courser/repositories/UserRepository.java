package com.ErickCoimbra.courser.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ErickCoimbra.courser.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
