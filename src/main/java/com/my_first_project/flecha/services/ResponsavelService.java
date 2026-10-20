package com.my_first_project.flecha.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.my_first_project.flecha.entites.Responsavel;
import com.my_first_project.flecha.repositories.ResponsavelRepository;
import com.my_first_project.flecha.services.exceptions.RecursoDuplicadoException;

@Service
public class ResponsavelService {

	@Autowired
	private ResponsavelRepository repository;

	public List<Responsavel> findAll() {
		return repository.findAll();
	}

	public Responsavel findById(Long id) {
		Optional<Responsavel> obj = repository.findById(id);
		return obj.get();
	}
	
	public Responsavel insert(Responsavel obj) {
		 boolean existe = repository
			        .existsByNomeMaeIgnoreCaseAndNomePaiIgnoreCaseAndTelefone(
			            obj.getNomeMae(),
			            obj.getNomePai(),
			            obj.getTelefone()
			        );

			    if (existe) {
			        throw new RecursoDuplicadoException(
			            "Esse responsável já está cadastrado."
			        );
			    }

			    return repository.save(obj);
	}

}
