package br.unisinos.bd2.campeonato.brasileiro.db4o.model;

import java.io.Serializable;

public class ClassificacaoGeral implements Serializable {
	
	// Atributos
	private static final long serialVersionUID = 1L;
	
	private Long idClassificacaoGeral;

	private Campeonato campeonato;
	
	private int posicao;
	
	private Clube clube;

	// Metodos
	public Long getIdClassificacaoGeral() {
		return idClassificacaoGeral;
	}

	public void setIdClassificacaoGeral(Long idClassificacaoGeral) {
		this.idClassificacaoGeral = idClassificacaoGeral;
	}

	public Campeonato getCampeonato() {
		return campeonato;
	}

	public void setCampeonato(Campeonato campeonato) {
		this.campeonato = campeonato;
	}

	public int getPosicao() {
		return posicao;
	}

	public void setPosicao(int posicao) {
		this.posicao = posicao;
	}

	public Clube getClube() {
		return clube;
	}

	public void setClube(Clube clube) {
		this.clube = clube;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
