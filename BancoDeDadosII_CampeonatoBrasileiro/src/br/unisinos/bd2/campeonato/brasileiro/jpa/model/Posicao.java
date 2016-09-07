package br.unisinos.bd2.campeonato.brasileiro.jpa.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Posicao implements Serializable {
	
	// Atributos
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO, generator = "posicaoSeq")
	@SequenceGenerator (name = "posicaoSeq", sequenceName = "s_Posicao", allocationSize = 1)
	private Long idPosicao;
	
	@Column (length = 50, nullable = true)
	private String nome;

	// Metodos
	public Long getIdPosicao() {
		return idPosicao;
	}

	public void setIdPosicao(Long idPosicao) {
		this.idPosicao = idPosicao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
