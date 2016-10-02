package br.unisinos.bd2.campeonato.brasileiro.db4o.model;

import java.io.Serializable;

public class TorcidaOrganizada implements Serializable {

	// Atributos
	private static final long serialVersionUID = 1L;

	private Long idTorcidaOrganizada;
	
	private String nome;
	
	// Metodos
	public TorcidaOrganizada(Long idTorcidaOrganizada, String nome){
		super();
		this.idTorcidaOrganizada = idTorcidaOrganizada; 
		this.nome = nome;
	}
	
	public void setIdTorcidaOrganizada (long id) {
		this.idTorcidaOrganizada = id;
	}
	
	public void setNome (String nome) {
		this.nome = nome;
	}
	
	public long getIdTorcidaOrganizada () {
		return this.idTorcidaOrganizada;
	}
	
	public String getNome () {
		return this.nome;
	}
	
}
