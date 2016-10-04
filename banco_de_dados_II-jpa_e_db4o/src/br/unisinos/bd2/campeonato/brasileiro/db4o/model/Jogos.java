package br.unisinos.bd2.campeonato.brasileiro.db4o.model;

import java.io.Serializable;

public class Jogos implements Serializable{

	// Atributos
	private static final long serialVersionUID = 1L;
	
	private Long idJogo;
	
	private Campeonato campeonato;
	
	private Rodadas rodada;
	
	private Clube clube1;
	
	private Clube clube2;
	
	private int clube1Gol;
	
	private int clube2Gol;
	
	private int clube1Ponto;
	
	private int clube2Ponto;
	
	private int clube1Amarelo;
	
	private int clube2Amarelo;
	
	private int clube1Vermelho;
	
	private int clube2Vermelho;
	
	//Métodos
	
	public Jogos(Long idJogo, Campeonato campeonato, Rodadas rodada, Clube clube1, Clube clube2, int clube1Gol, int clube2Gol, int clube1Ponto, int clube2Ponto, int clube1Amarelo, int clube2Amarelo, int clube1Vermelho, int clube2Vermelho){
		super();
		this.idJogo = idJogo;
		this.campeonato = campeonato;
		this.rodada = rodada;
		this.clube1 = clube1;
		this.clube2 = clube2;
		this.clube1Gol = clube1Gol;
		this.clube2Gol = clube2Gol;
		this.clube1Ponto = clube1Ponto;
		this.clube2Ponto = clube2Ponto;
		this.clube1Amarelo = clube1Amarelo;
		this.clube2Amarelo = clube2Amarelo;
		this.clube1Vermelho = clube1Vermelho;
		this.clube2Vermelho = clube2Vermelho;
	}
	
	public Long getIdJogo() {
		return idJogo;
	}

	public void setIdJogo(Long idJogo) {
		this.idJogo = idJogo;
	}
	
	public Campeonato getCampeonato() {
		return campeonato;
	}

	public void setCampeonato(Campeonato campeonato) {
		this.campeonato = campeonato;
	}
	
	public Rodadas getRodada() {
		return rodada;
	}

	public void setRodada(Rodadas rodada) {
		this.rodada = rodada;
	}
	
	public Clube getClube1() {
		return clube1;
	}

	public void setClube1(Clube clube) {
		this.clube1 = clube;
	}
	
	public Clube getClube2() {
		return clube2;
	}

	public void setClube2(Clube clube) {
		this.clube2 = clube;
	}
	
	public int getClube1Gol(){
		return this.clube1Gol;
	}
	
	public int getClube2Gol(){
		return this.clube2Gol;
	}
	
	public int getClube1Ponto(){
		return this.clube1Ponto;
	}
	
	public int getClube2Ponto(){
		return this.clube2Ponto;
	}
	
	public int getClube1Amarelo(){
		return this.clube1Amarelo;
	}
	
	public int getClube1Vermelho(){
		return this.clube1Vermelho;
	}
	
	public int getClube2Amarelo(){
		return this.clube2Amarelo;
	}
	
	public int getClube2Vermelho(){
		return this.clube2Vermelho;
	}
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
