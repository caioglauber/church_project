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
}
