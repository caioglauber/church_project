package com.my_first_project.flecha.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.my_first_project.flecha.entites.Sala;

public interface SalaRepository extends JpaRepository<Sala, Long> {

	
}
