package com.my_first_project.flecha.entites;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.annotations.Audited.Table;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
@Table(name = "tb_sala")
public class Sala {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String tia;
	
	@OneToMany(mappedBy = "sala")
	private Set<Crianca> criancas = new HashSet<>();
	
	public Sala() {
	}

	public Sala(Long id, String nome, String tia) {
		this.id = id;
		this.nome = nome;
		this.tia = tia;
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

	public String getTia() {
		return tia;
	}

	public void setTia(String tia) {
		this.tia = tia;
	}
	

	public Set<Crianca> getCriancas() {
		return criancas;
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
		Sala other = (Sala) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
}
