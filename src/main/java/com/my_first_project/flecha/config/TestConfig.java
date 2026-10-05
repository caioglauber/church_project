package com.my_first_project.flecha.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.my_first_project.flecha.entites.Crianca;
import com.my_first_project.flecha.repositories.CriancaRepository;

@Configuration 
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private CriancaRepository criancaRepository;

	@Override
	public void run(String... args) throws Exception {
		
		Crianca c1 = new Crianca(null, "Davi Carvalho", Instant.parse("1989-05-01T00:00:00Z"));
		Crianca c2 = new Crianca(null, "Benicio Carvalho", Instant.parse("1989-05-01T00:00:00Z"));
		
		criancaRepository.saveAll(Arrays.asList(c1,c2));
		
	}
	
	
}
