package com.my_first_project.flecha.resources;

import java.time.Instant;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.my_first_project.flecha.entites.Crianca;

@RestController
@RequestMapping(value = "/criancas")
public class CriancaResource {

	//metodo end point para acessar as criancas
	@GetMapping
	public ResponseEntity<Crianca> findAll(){
		Crianca c = new Crianca(1l, "Ben", Instant.parse("2021-12-16T00:00:00Z"));
		return ResponseEntity.ok().body(c);
	}
	
}
