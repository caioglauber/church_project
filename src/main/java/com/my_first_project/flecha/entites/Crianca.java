package com.my_first_project.flecha.entites;

import java.io.Serializable;
import java.time.Instant;
import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_crianca")
public class Crianca implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private Instant anoNascimento;
	
	
	private Set<Responsavel> responsaveis = new HashSet<>();
	
	
	public Crianca() {}

	public Crianca(Long id, String nome, Instant anoNascimento) {
		this.id = id;
		this.nome = nome;
		this.anoNascimento = anoNascimento;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public Instant getAnoNascimento() {
		return anoNascimento;
	}


	public void setAnoNascimento(Instant anoNascimento) {
		this.anoNascimento = anoNascimento;
	}


	public Set<Responsavel> getResponsaveis() {
		return responsaveis;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Crianca other = (Crianca) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Crianca [id=" + id + ", nome=" + nome + ", anoNascimento=" + anoNascimento + "]";
	}
}
