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
	
	public Rodadas(Long idRodada, Campeonato campeonato, Jogador artilheiro, int totalJogos, int totalAmarelos, int totalVermelhos, int totalGols){
		super();
		this.idRodada = idRodada;
		this.campeonato = campeonato;
		this.artilheiro = artilheiro;
		this.totalJogos = totalJogos;
		this.totalAmarelos = totalAmarelos;
		this.totalVermelhos = totalVermelhos;
		this.totalGols = totalGols;
	}
	
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
