package br.unisinos.bd2.campeonato.brasileiro.jpa.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Clube implements Serializable {
	
	// Atributos
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue (strategy = GenerationType.AUTO, generator = "clubeSeq")
	@SequenceGenerator (name = "clubeSeq", sequenceName = "s_Clube", allocationSize = 1)
	private Long idClube;
	
	@Column(length = 50, nullable = false)
	private String nome;
	
	@Column(nullable = false)
	private Long jogador1;
	
	@Column(nullable = false)
	private Long jogador2;
	
	@Column(nullable = false)
	private Long jogador3;
	
	@Column(nullable = false)
	private Long jogador4;
	
	@Column(nullable = false)
	private Long jogador5;
	
	@Column(nullable = false)
	private Long jogador6;
	
	@Column(nullable = false)
	private Long jogador7;
	
	@Column(nullable = false)
	private Long jogador8;
	
	@Column(nullable = false)
	private Long jogador9;
	
	@Column(nullable = false)
	private Long jogador10;
	
	@Column(nullable = false)
	private Long jogador11;
	
	@Column(nullable = false)
	private Long jogador12;
	
	@Column(nullable = false)
	private Long jogador13;
	
	@Column(nullable = false)
	private Long jogador14;
	
	@Column(nullable = false)
	private Long jogador15;
	
	@Column(nullable = false)
	private Long jogador16;
	
}
