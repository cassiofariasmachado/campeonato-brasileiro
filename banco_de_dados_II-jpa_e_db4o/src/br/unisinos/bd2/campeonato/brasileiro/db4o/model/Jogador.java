package br.unisinos.bd2.campeonato.brasileiro.db4o.model;

import java.io.Serializable;

public class Jogador implements Serializable{

	// Atributos
	private static final long serialVersionUID = 1L;
	
	private Long idJogador;
	
	private String nome;
	
	private Posicao posicao;

	// Construtor
	public Jogador(Long idJogador, String nome, Posicao posicao) {
		super();
		this.idJogador = idJogador;
		this.nome = nome;
		this.posicao = posicao;
	}
	
	// Metodos
	public Long getIdJogador() {
		return idJogador;
	}

	public void setIdJogador(Long idJogador) {
		this.idJogador = idJogador;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Posicao getPosicao() {
		return posicao;
	}

	public void setPosicao(Posicao posicao) {
		this.posicao = posicao;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}	
}