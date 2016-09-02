package br.unisinos.bd2.campeonato.brasileiro;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class TorcidaOrganizada implements Serializable 
{

	// Atributos
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue (strategy = GenerationType.AUTO, generator = "torcidaOrganizadaSeq")
	@SequenceGenerator (name = "torcidaOrganizadaSeq", sequenceName = "s_TorcidaOrganizada", allocationSize = 1)
	private Long idTorcidaOrganizada;
	
	@Column (length = 50, nullable = true)
	private String nome;
	
	// Metodos
	public void setIdTorcidaOrganizada (long id)
	{
		this.idTorcidaOrganizada = id;
	}
	
	public void setNome (String nome)
	{
		this.nome = nome;
	}
	
	public long getIdTorcidaOrganizada ()
	{
		return this.idTorcidaOrganizada;
	}
	
	public String getNome ()
	{
		return this.nome;
	}
	
}
