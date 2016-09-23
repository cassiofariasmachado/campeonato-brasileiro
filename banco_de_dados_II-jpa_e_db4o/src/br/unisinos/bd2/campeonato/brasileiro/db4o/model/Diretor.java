package br.unisinos.bd2.campeonato.brasileiro.db4o.model;

import java.io.Serializable;

public class Diretor implements Serializable {

	// Atributos
	private static final long serialVersionUID = 1L;
	
	private Long idDiretor;
	
	private String nome;

	// Metodos
	public Long getIdDiretor() {
		return idDiretor;
	}

	public void setIdDiretor(Long idDiretor) {
		this.idDiretor = idDiretor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}