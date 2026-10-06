package com.my_first_project.flecha.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.my_first_project.flecha.entites.Crianca;
import com.my_first_project.flecha.entites.Sala;
import com.my_first_project.flecha.repositories.SalaRepository;

@Service
public class SalaService {

	@Autowired
	private SalaRepository repository;

	public List<Sala> findAll(){
		return repository.findAll();
	}
	
	public Sala findById(Long id) {
		Optional<Sala> obj =  repository.findById(id);
		return obj.get();
	}	
	
}
