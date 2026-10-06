package com.my_first_project.flecha.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.my_first_project.flecha.entites.Crianca;
import com.my_first_project.flecha.entites.Responsavel;
import com.my_first_project.flecha.repositories.CriancaRepository;
import com.my_first_project.flecha.repositories.ResponsavelRepository;

@Configuration 

public class TestConfig implements CommandLineRunner {

	@Autowired
	private CriancaRepository criancaRepository;
	
	@Autowired
	private ResponsavelRepository responsavelRepository;

	@Override
	public void run(String... args) throws Exception {
		/*
		Responsavel resp1 = new Responsavel(null, "Renatha Carvalho", "Caio Glauber", "83993161635");
		Responsavel resp2 = new Responsavel(null, "Daiana", "Iggo nicolas", "83993161635");
		Responsavel resp3 = new Responsavel(null, "Thalita Medeiros", "Vitor Hugo", "83993161635");
		
		responsavelRepository.saveAll(Arrays.asList(resp1,resp2,resp3));
		
		Crianca c1 = new Crianca(null, "Davi Carvalho", Instant.parse("1989-05-01T00:00:00Z"), resp1);
		Crianca c2 = new Crianca(null, "Benicio Carvalho", Instant.parse("1989-05-01T00:00:00Z"), resp1);
		Crianca c3 = new Crianca(null, "Isaque", Instant.parse("1989-05-01T00:00:00Z"), resp2);
		Crianca c4 = new Crianca(null, "Joaquim", Instant.parse("1989-05-01T00:00:00Z"), resp3);
		
		criancaRepository.saveAll(Arrays.asList(c1,c2,c3,c4));
		
		*/
		
	}
	
	
}
