package br.unisinos.bd2.campeonato.brasileiro.db4o.model;

import java.io.Serializable;

public class ClubeTorcida implements Serializable {
	
	// Atributos
	private static final long serialVersionUID = 1L;
	
	private Long idClubeTorcida;
	
	private TorcidaOrganizada torcidaOrganizada;
	
	private Clube clube;

	// Metodos
	public ClubeTorcida(Long idClubeTorcida, TorcidaOrganizada torcida, Clube clube){
		super();
		this.idClubeTorcida = idClubeTorcida;
		this.torcidaOrganizada = torcida;
		this.clube = clube;
	}
	
	public Long getIdClubeTorcida() {
		return idClubeTorcida;
	}

	public void setIdClubeTorcida(Long idClubeTorcida) {
		this.idClubeTorcida = idClubeTorcida;
	}

	public TorcidaOrganizada getTorcidaOrganizada() {
		return torcidaOrganizada;
	}

	public void setTorcidaOrganizada(TorcidaOrganizada torcidaOrganizada) {
		this.torcidaOrganizada = torcidaOrganizada;
	}

	public Clube getClube() {
		return clube;
	}

	public void setClube(Clube clube) {
		this.clube = clube;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
