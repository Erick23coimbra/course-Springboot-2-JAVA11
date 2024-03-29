package com.ErickCoimbra.courser.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ErickCoimbra.courser.entities.User;
import com.ErickCoimbra.courser.repositories.UserRepository;
@Service
public class UserService {
	@Autowired // ingeção de dependencia transparente
	private UserRepository  repository;
	
	public List<User> findAll(){
		return repository.findAll();
	}
	public User findById(Long id) {
		Optional <User> obj =repository.findById(id);
		return obj.get();
	}

}
