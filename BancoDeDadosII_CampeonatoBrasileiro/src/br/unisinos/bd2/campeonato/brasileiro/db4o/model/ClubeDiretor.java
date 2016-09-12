package br.unisinos.bd2.campeonato.brasileiro.db4o.model;

import java.io.Serializable;

public class ClubeDiretor implements Serializable {
	
	// Atributos
	private static final long serialVersionUID = 1L;
	
	private Long idClubeDiretor;
	
	private Diretor idDiretor;
	
	private Clube idClube;

	// Metodos
	public Long getIdClubeDiretor() {
		return idClubeDiretor;
	}

	public void setIdClubeDiretor(Long idClubeDiretor) {
		this.idClubeDiretor = idClubeDiretor;
	}

	public Diretor getIdDiretor() {
		return idDiretor;
	}

	public void setIdDiretor(Diretor idDiretor) {
		this.idDiretor = idDiretor;
	}

	public Clube getIdClube() {
		return idClube;
	}

	public void setIdClube(Clube idClube) {
		this.idClube = idClube;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
