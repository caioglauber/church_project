package com.my_first_project.flecha.services;

import java.time.Year;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.my_first_project.flecha.entites.Crianca;
import com.my_first_project.flecha.entites.Sala;
import com.my_first_project.flecha.repositories.CriancaRepository;
import com.my_first_project.flecha.repositories.SalaRepository;

@Service
public class CriancaService {

	@Autowired
	private CriancaRepository criancaRepository;

	public List<Crianca> findAll() {
		return criancaRepository.findAll();
	}

	public Crianca findById(Long id) {
		Optional<Crianca> obj = criancaRepository.findById(id);
		return obj.get();
	}

	public List<Crianca> findBySala(Long salaId) {
		return criancaRepository.findBySalaId(salaId);

	}
	
	public Crianca insert(Crianca obj) {
		
		boolean existe = criancaRepository
	            .existsByNomeIgnoreCaseAndAnoNascimentoAndRespId(
	                    obj.getNome(),
	                    obj.getAnoNascimento(),
	                    obj.getResp().getId()
	            );

	    if (existe) {
	        throw new IllegalArgumentException(
	                "Essa criança já está cadastrada para esse responsável."
	        );
	    }
		return criancaRepository.save(obj);
	}
	
	public int idade(Integer anoNascimento) {
	    return java.time.Year.now().getValue() - anoNascimento;
	}
	
	
}
