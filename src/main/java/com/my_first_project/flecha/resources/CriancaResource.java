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

import com.my_first_project.flecha.entites.Crianca;
import com.my_first_project.flecha.services.CriancaService;

@RestController
@RequestMapping(value = "/criancas")
public class CriancaResource {

	@Autowired
	private CriancaService service;
	
	//metodo end point para acessar as criancas e testar na web
	@GetMapping
	public ResponseEntity<List<Crianca>> findAll(){
		List<Crianca> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Crianca> findById(@PathVariable Long id){
		Crianca obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
	@GetMapping("/sala/{id}")
	public ResponseEntity<List<Crianca>> findBySala(@PathVariable Long id) {

	    List<Crianca> obj = service.findBySala(id);

	    return ResponseEntity.ok().body(obj);
	}
	
	@PostMapping
	public ResponseEntity<Crianca> insert(@RequestBody Crianca obj){
		obj = service.insert(obj);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(obj.getId()).toUri();
		return ResponseEntity.created(uri).body(obj);
	}
	
}
