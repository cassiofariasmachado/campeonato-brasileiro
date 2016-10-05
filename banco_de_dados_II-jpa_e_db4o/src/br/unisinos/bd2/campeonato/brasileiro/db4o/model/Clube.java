package br.unisinos.bd2.campeonato.brasileiro.db4o.model;

import java.io.Serializable;

public class Clube implements Serializable {

	//Atributos
	private static final long serialVersionUID = 1L;
	
	private Long idClube;
	
	private String nome;
	
	private Jogador jogador1;
	
	private Jogador jogador2;
	
	private Jogador jogador3;
	
	private Jogador jogador4;
	
	private Jogador jogador5;
	
	private Jogador jogador6;
	
	private Jogador jogador7;
	
	private Jogador jogador8;
	
	private Jogador jogador9;
	
	private Jogador jogador10;
	
	private Jogador jogador11;
	
	private Jogador jogador12;
	
	private Jogador jogador13;
	
	private Jogador jogador14;
	
	private Jogador jogador15;
	
	private Jogador jogador16;
	
	// Metodos
	public Clube(Long idClube, String nome, Jogador jogador1, Jogador jogador2, Jogador jogador3, 
			Jogador jogador4, Jogador jogador5, Jogador jogador6, Jogador jogador7, Jogador jogador8, Jogador jogador9, Jogador jogador10,
			Jogador jogador11, Jogador jogador12, Jogador jogador13, Jogador jogador14, Jogador jogador15, Jogador jogador16){
		super();
		this.idClube = idClube;
		this.nome = nome;
		this.jogador1 = jogador1;
		this.jogador2 = jogador2;
		this.jogador3 = jogador3;
		this.jogador4 = jogador4;
		this.jogador5 = jogador5;
		this.jogador6 = jogador6;
		this.jogador7 = jogador7;
		this.jogador8 = jogador8;
		this.jogador9 = jogador9;
		this.jogador10 = jogador10;
		this.jogador11 = jogador11;
		this.jogador12 = jogador12;
		this.jogador13 = jogador13;
		this.jogador14 = jogador14;
		this.jogador15 = jogador15;
		this.jogador16 = jogador16;
	}

	// Métodos
	public Long getIdClube() {
		return idClube;
	}

	public void setIdClube(Long idClube) {
		this.idClube = idClube;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Jogador getJogador1() {
		return jogador1;
	}

	public void setJogador1(Jogador jogador1) {
		this.jogador1 = jogador1;
	}

	public Jogador getJogador2() {
		return jogador2;
	}

	public void setJogador2(Jogador jogador2) {
		this.jogador2 = jogador2;
	}

	public Jogador getJogador3() {
		return jogador3;
	}

	public void setJogador3(Jogador jogador3) {
		this.jogador3 = jogador3;
	}

	public Jogador getJogador4() {
		return jogador4;
	}

	public void setJogador4(Jogador jogador4) {
		this.jogador4 = jogador4;
	}

	public Jogador getJogador5() {
		return jogador5;
	}

	public void setJogador5(Jogador jogador5) {
		this.jogador5 = jogador5;
	}

	public Jogador getJogador6() {
		return jogador6;
	}

	public void setJogador6(Jogador jogador6) {
		this.jogador6 = jogador6;
	}

	public Jogador getJogador7() {
		return jogador7;
	}

	public void setJogador7(Jogador jogador7) {
		this.jogador7 = jogador7;
	}

	public Jogador getJogador8() {
		return jogador8;
	}

	public void setJogador8(Jogador jogador8) {
		this.jogador8 = jogador8;
	}

	public Jogador getJogador9() {
		return jogador9;
	}

	public void setJogador9(Jogador jogador9) {
		this.jogador9 = jogador9;
	}

	public Jogador getJogador10() {
		return jogador10;
	}

	public void setJogador10(Jogador jogador10) {
		this.jogador10 = jogador10;
	}

	public Jogador getJogador11() {
		return jogador11;
	}

	public void setJogador11(Jogador jogador11) {
		this.jogador11 = jogador11;
	}

	public Jogador getJogador12() {
		return jogador12;
	}

	public void setJogador12(Jogador jogador12) {
		this.jogador12 = jogador12;
	}

	public Jogador getJogador13() {
		return jogador13;
	}

	public void setJogador13(Jogador jogador13) {
		this.jogador13 = jogador13;
	}

	public Jogador getJogador14() {
		return jogador14;
	}

	public void setJogador14(Jogador jogador14) {
		this.jogador14 = jogador14;
	}

	public Jogador getJogador15() {
		return jogador15;
	}

	public void setJogador15(Jogador jogador15) {
		this.jogador15 = jogador15;
	}

	public Jogador getJogador16() {
		return jogador16;
	}

	public void setJogador16(Jogador jogador16) {
		this.jogador16 = jogador16;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
