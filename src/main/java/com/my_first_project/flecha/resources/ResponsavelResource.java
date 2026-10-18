package com.my_first_project.flecha.resources;

import java.net.URI;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;


import com.my_first_project.flecha.entites.Responsavel;
import com.my_first_project.flecha.services.ResponsavelService;

@RestController
@RequestMapping(value = "/resp")
public class ResponsavelResource {

	@Autowired
	private ResponsavelService service;
	
	//metodo end point para acessar as Responsavels e testar na web
	@GetMapping
	public ResponseEntity<List<Responsavel>> findAll(){
		List<Responsavel> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Responsavel> findById(@PathVariable Long id){
		Responsavel obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
	@PostMapping
	public ResponseEntity<Responsavel> insert(@RequestBody Responsavel obj){
		obj = service.insert(obj);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(obj.getId()).toUri();
		return ResponseEntity.created(uri).body(obj);
	}
}
