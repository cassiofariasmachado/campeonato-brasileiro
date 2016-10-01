package br.unisinos.bd2.campeonato.brasileiro.db4o.model;

import java.io.Serializable;

public class Patrocinador implements Serializable {

	// Atributos
	private static final long serialVersionUID = 1L;
	
	private Long idPatrocinador;
	
	private String nome;
	
	//Construtor
	public Patrocinador(Long idPatrocinador, String nome) {
		super();
		this.idPatrocinador = idPatrocinador;
		this.nome = nome;
	}
	
	// Metodos
	public Long getIdPatrocinador() {
		return idPatrocinador;
	}

	public void setIdPatrocinador(Long idPatrocinador) {
		this.idPatrocinador = idPatrocinador;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String name) {
		this.nome = name;
	}
		
}
