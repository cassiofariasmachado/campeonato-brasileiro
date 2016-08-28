package br.unisinos.bd2.campeonato.brasileiro;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Jogador implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO, generator = "jogadorSeq")
	@SequenceGenerator (name = "jogadorSeq", sequenceName = "s_Jogador", allocationSize = 1)
	private Long idJogador;
	
	@Column (length = 50, nullable = true)
	private String nome;
	
	@ManyToOne (optional = false)
	private Posicao posicao;
	
}
