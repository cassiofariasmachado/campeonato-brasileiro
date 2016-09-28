package br.unisinos.bd2.campeonato.brasileiro.db4o.model;

import java.io.Serializable;

public class Tecnico implements Serializable  {

	// Atributos
	private static final long serialVersionUID = 1L;
	
	private Long idTecnico;
	
	private String nome;

	// Metodos
	public Long getIdTecnico() {
		return idTecnico;
	}

	public void setIdTecnico(Long idTecnico) {
		this.idTecnico = idTecnico;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
