package com.my_first_project.flecha.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.my_first_project.flecha.entites.Crianca;

public interface CriancaRepository extends JpaRepository<Crianca, Long> {

	
}
