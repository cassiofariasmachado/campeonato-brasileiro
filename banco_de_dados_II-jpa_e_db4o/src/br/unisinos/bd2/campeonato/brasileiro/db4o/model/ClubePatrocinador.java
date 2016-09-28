package br.unisinos.bd2.campeonato.brasileiro.db4o.model;

import java.io.Serializable;

public class ClubePatrocinador implements Serializable 
{

	// Atributos
	private static final long serialVersionUID = 1L;
	
	private Long idClubePatrocinador;
	
	private Clube idClube;
	
	private Patrocinador idPatrocinador;

	public Long getIdClubePatrocinador() {
		return idClubePatrocinador;
	}
	
	// Metodos
	public void setIdClubePatrocinador(Long idClubePatrocinador) {
		this.idClubePatrocinador = idClubePatrocinador;
	}

	public Clube getIdClube() {
		return idClube;
	}

	public void setIdClube(Clube idClube) {
		this.idClube = idClube;
	}

	public Patrocinador getIdPatrocinador() {
		return idPatrocinador;
	}

	public void setIdPatrocinador(Patrocinador idPatrocinador) {
		this.idPatrocinador = idPatrocinador;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
