package br.unisinos.bd2.campeonato.brasileiro;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class ClassificacaoGeral implements Serializable  
{
	// Atributos
	private static final long serialVersionUID = 1L;

	@ManyToOne (optional = false)
	private Campeonato idCampeonato;
	
	@Column (nullable = false)
	private int posicao;
	
	// TODO: Clube
	
	// Metodos
}
