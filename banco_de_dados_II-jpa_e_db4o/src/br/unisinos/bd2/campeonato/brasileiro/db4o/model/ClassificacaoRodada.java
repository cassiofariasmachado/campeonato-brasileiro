package br.unisinos.bd2.campeonato.brasileiro.db4o.model;

import java.io.Serializable;

public class ClassificacaoRodada implements Serializable{

	// Atributos
	private static final long serialVersionUID = 1L;
		
	private Long idClassificacaoRodada;
		
	private Campeonato campeonato;
	
	private Rodadas rodada;
		
	private int posicao;
		
	private Clube clube;
	
	// Metodos
		public Long getIdClassificacaoRodada() {
			return idClassificacaoRodada;
		}

		public void setIdClassificacaoRodada(Long idClassificacaoRodada) {
			this.idClassificacaoRodada = idClassificacaoRodada;
		}
		
		public Rodadas getRodada() {
			return rodada;
		}

		public void setRodada(Rodadas rodada) {
			this.rodada = rodada;
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
