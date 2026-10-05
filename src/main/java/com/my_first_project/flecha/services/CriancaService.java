package com.my_first_project.flecha.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.my_first_project.flecha.entites.Crianca;
import com.my_first_project.flecha.repositories.CriancaRepository;

@Service
public class CriancaService {

	@Autowired
	private CriancaRepository repository;

	public List<Crianca> findAll(){
		return repository.findAll();
	}
	
	public Crianca findById(Long id) {
		Optional<Crianca> obj =  repository.findById(id);
		return obj.get();
	}
	
}
