package br.unisinos.bd2.campeonato.brasileiro.jpa.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Diretor implements Serializable{
	
	// Atributos
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue (strategy = GenerationType.AUTO, generator = "diretorSeq")
	@SequenceGenerator (name = "diretorSeq", sequenceName = "s_Diretor", allocationSize = 1)
	private Long idDiretor;
	
	@Column (length = 50, nullable = true)
	private String nome;

	// Metodos
	public Long getIdDiretor() {
		return idDiretor;
	}

	public void setIdDiretor(Long idDiretor) {
		this.idDiretor = idDiretor;
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