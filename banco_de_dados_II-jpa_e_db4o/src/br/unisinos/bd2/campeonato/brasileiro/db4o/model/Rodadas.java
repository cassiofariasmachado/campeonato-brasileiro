package br.unisinos.bd2.campeonato.brasileiro.db4o.model;

import java.io.Serializable;

public class Rodadas implements Serializable{

	// Atributos
	private static final long serialVersionUID = 1L;
	
	private Long idRodada;
	
	private Campeonato campeonato;
	
	private Jogador artilheiro;
	
	private int totalJogos;
	
	private int totalAmarelos;
	
	private int totalVermelhos;
	
	private int totalGols;
	
	
	//Métodos
	
	public Long getIdRodada() {
		return idRodada;
	}

	public void setIdRodada(Long idRodada) {
		this.idRodada = idRodada;
	}
	
	public Campeonato getCampeonato() {
		return campeonato;
	}

	public void setCampeonato(Campeonato campeonato) {
		this.campeonato = campeonato;
	}
	
	public Jogador getArtilheiro() {
		return artilheiro;
	}

	public void setArtilheiro(Jogador artilheiro) {
		this.artilheiro = artilheiro;
	}
	
	public int getTotalJogos(){
		return this.totalJogos;
	}
	
	public int getTotalAmarelos(){
		return this.totalAmarelos;
	}
	
	public int getTotalVermelhos(){
		return this.totalVermelhos;
	}
	
	public int getTotalGols(){
		return this.totalGols;
	}
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
