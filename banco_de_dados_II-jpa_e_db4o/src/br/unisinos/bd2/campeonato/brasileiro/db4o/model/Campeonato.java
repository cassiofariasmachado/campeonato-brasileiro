package br.unisinos.bd2.campeonato.brasileiro.db4o.model;

import java.io.Serializable;

public class Campeonato implements Serializable {
	
	// Atributos
	private static final long serialVersionUID = 1L;

	private Long idCampeonato;
	
	private String nome;
	
	private int ano;
	
	private int nroClubes;
	
	// Metodos
	public Campeonato(Long idCampeonato, String nome, int ano, int nroClubes){
		super();
		this.idCampeonato = idCampeonato;
		this.nome = nome;
		this.ano = ano;
		this.nroClubes = nroClubes;
	}
	
	public void setIdCampeonato (long id) {
		this.idCampeonato = id;
	}
	
	public void setNome (String nome) {
		this.nome = nome;
	}
	
	public void setNroClubes (int nro) {
		this.nroClubes = nro;
	}
	
	public void setAno (int ano) {
		this.ano = ano;
	}
	
	public long getIdCampeonato () {
		return this.idCampeonato;
	}
	
	public String getNome () {
		return this.nome;
	}
	
	public int getNroClubes () {
		return this.nroClubes;
	}
	
	public int getAno () {
		return this.ano;
	}
	
}
