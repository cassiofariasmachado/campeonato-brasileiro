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
public class ClassificacaoGeral implements Serializable  
{
	// Atributos
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO, generator = "classificacaoGeralSeq")
	@SequenceGenerator (name = "classificacaoGeralSeq", sequenceName = "s_ClassificacaoGeral", allocationSize = 1)
	private Long idClassificacaoGeral;

	@ManyToOne (optional = false)
	private Campeonato campeonato;
	
	@Column (nullable = false, unique = true)
	private int posicao;
	
	@ManyToOne(optional = false)
	private Clube clube;
	
	// Metodos
	public void setPosicao (int posicao)
	{
		this.posicao = posicao;
	}
	
	public int getPosicao ()
	{
		return this.posicao;
	}
}
