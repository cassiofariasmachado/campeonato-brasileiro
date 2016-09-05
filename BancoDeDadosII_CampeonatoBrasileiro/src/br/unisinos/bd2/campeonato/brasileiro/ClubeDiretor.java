package br.unisinos.bd2.campeonato.brasileiro;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class ClubeDiretor implements Serializable
{
	// Atributos
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO, generator = "clubeDiretorSeq")
	@SequenceGenerator (name = "clubeDiretorSeq", sequenceName = "s_ClubeDiretor", allocationSize = 1)
	private Long idClubeDiretor;
	
	@ManyToOne (optional = false)
	private Diretor idDiretor;
	
	@ManyToOne (optional = false)
	private Clube idClube;
	
	// Metodos
	public void setDiretor (Diretor id)
	{
		this.idDiretor = id;
	}
	
	public void setClube (Clube id)
	{
		this.idClube = id;
	}
	
	public Diretor getDiretor ()
	{
		return this.idDiretor;
	}
	
	public Clube getClube ()
	{
		return this.idClube;
	}
	
}
