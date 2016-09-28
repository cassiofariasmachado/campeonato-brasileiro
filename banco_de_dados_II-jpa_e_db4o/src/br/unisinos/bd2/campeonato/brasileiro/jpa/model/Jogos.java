package br.unisinos.bd2.campeonato.brasileiro.jpa.model;

import java.io.Serializable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

public class Jogos implements Serializable{

		// Atributos
		private static final long serialVersionUID = 1L;
		
		@Id
		@GeneratedValue (strategy = GenerationType.AUTO, generator = "jogosSeq")
		@SequenceGenerator (name = "jogosSeq", sequenceName = "s_Jogos", allocationSize = 1)
		private Long idJogos;
		
		@ManyToOne (optional = false)
		private Campeonato campeonato;
		
		@ManyToOne (optional = false)
		private Rodadas rodada;
		
		@ManyToOne (optional = false)
		private Clube clube1;
		
		@ManyToOne (optional = false)
		private Clube clube2;
		
		
}
