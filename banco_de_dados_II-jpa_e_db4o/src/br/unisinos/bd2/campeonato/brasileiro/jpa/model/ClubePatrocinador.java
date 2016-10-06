package br.unisinos.bd2.campeonato.brasileiro.jpa.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class ClubePatrocinador implements Serializable {

	// Atributos
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO, generator = "clubePatrocinadorSeq")
	@SequenceGenerator (name = "clubePatrocinadorSeq", sequenceName = "s_ClubePatrocinador", allocationSize = 1)
	private Long idClubePatrocinador;
	
	@ManyToOne (optional = false)
	private Clube idClube;
	
	@ManyToOne (optional = false)
	private Patrocinador idPatrocinador;
	
	// Metodos
	public void setClube (Clube id)	{
		this.idClube = id;
	}
	
	public void setPatrocinador (Patrocinador id) {
		this.idPatrocinador = id;
	}
	
	public Clube getClube () {
		return this.idClube;
	}
	
	public Patrocinador getPatrocinador () {
		return this.idPatrocinador;
	}

}