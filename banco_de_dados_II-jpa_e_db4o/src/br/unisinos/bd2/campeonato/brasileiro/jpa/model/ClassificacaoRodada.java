package br.unisinos.bd2.campeonato.brasileiro.jpa.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class ClassificacaoRodada implements Serializable {

	// Atributos
		private static final long serialVersionUID = 1L;
		
		@Id
		@GeneratedValue (strategy = GenerationType.AUTO, generator = "classificacaoRodadaSeq")
		@SequenceGenerator (name = "classificacaoRodadaSeq", sequenceName = "s_ClassificacaoRodada", allocationSize = 1)
		private Long idClassificacaoRodada;
		
		@ManyToOne (optional = false)
		private Campeonato campeonato;
		
		@ManyToOne (optional = false)
		private Rodadas rodada;
		
		@Column (nullable = false, unique = true)
		private int posicao;
		
		@ManyToOne(optional = false)
		private Clube clube;
		
		// Métodos
		public void setPosicao (int posicao) {
			this.posicao = posicao;
		}
		
		public int getPosicao () {
			return this.posicao;
		}
}
