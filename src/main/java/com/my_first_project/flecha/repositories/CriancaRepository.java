package com.my_first_project.flecha.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.my_first_project.flecha.entites.Crianca;

public interface CriancaRepository extends JpaRepository<Crianca, Long> {

	List<Crianca> findBySalaId(Long salaId);

}
