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
public class Jogador implements Serializable{
	
	// Atributos
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO, generator = "jogadorSeq")
	@SequenceGenerator (name = "jogadorSeq", sequenceName = "s_Jogador", allocationSize = 1)
	private Long idJogador;
	
	@Column (length = 50, nullable = true)
	private String nome;
	
	@ManyToOne (optional = false)
	private Posicao posicao;

	// Metodos
	public Long getIdJogador() {
		return idJogador;
	}

	public void setIdJogador(Long idJogador) {
		this.idJogador = idJogador;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Posicao getPosicao() {
		return posicao;
	}

	public void setPosicao(Posicao posicao) {
		this.posicao = posicao;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
