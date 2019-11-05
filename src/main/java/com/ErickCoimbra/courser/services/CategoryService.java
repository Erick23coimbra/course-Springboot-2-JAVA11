package com.ErickCoimbra.courser.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ErickCoimbra.courser.entities.Category;
import com.ErickCoimbra.courser.repositories.CategoryRepository;
@Service
public class CategoryService {
	@Autowired // ingeção de dependencia transparente
	private CategoryRepository  repository;
	
	public List<Category> findAll(){
		return repository.findAll();
	}
	public Category findById(Long id) {
		Optional <Category> obj =repository.findById(id);
		return obj.get();
	}

}
