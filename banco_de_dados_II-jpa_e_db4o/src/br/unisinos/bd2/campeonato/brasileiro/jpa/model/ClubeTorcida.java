package br.unisinos.bd2.campeonato.brasileiro.jpa.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class ClubeTorcida implements Serializable {
	
	// Atributos
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO, generator = "clubeTorcidaSeq")
	@SequenceGenerator (name = "clubeTorcidaSeq", sequenceName = "s_ClubeTorcida", allocationSize = 1)
	private Long idClubeTorcida;
	
	@ManyToOne (optional = false)
	private TorcidaOrganizada torcidaOrganizada;
	
	@ManyToOne (optional = false)
	private Clube clube;

	// Metodos
	public Long getIdClubeTorcida() {
		return idClubeTorcida;
	}

	public void setIdClubeTorcida(Long idClubeTorcida) {
		this.idClubeTorcida = idClubeTorcida;
	}
	
}
