package br.unisinos.bd2.campeonato.brasileiro;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Campeonato implements Serializable
{
	// Atributos
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue (strategy = GenerationType.AUTO, generator = "campeonatoSeq")
	@SequenceGenerator (name = "campeonatoSeq", sequenceName = "s_Campeonato", allocationSize = 1)
	private Long idCampeonato;
	
	@Column (length = 50, nullable = true)
	private String nome;
	
	@Column (nullable = true)
	private int ano;
	
	@Column (nullable = true)
	private int nroClubes;
	
	// Metodos
	public void setIdCampeonato (long id)
	{
		this.idCampeonato = id;
	}
	
	public void setNome (String nome)
	{
		this.nome = nome;
	}
	
	public void setNroClubes (int nro)
	{
		this.nroClubes = nro;
	}
	
	public long getIdCampeonato ()
	{
		return this.idCampeonato;
	}
	
	public String getNome ()
	{
		return this.nome;
	}
	
	public int getNroClubes ()
	{
		return this.nroClubes;
	}
	
}
