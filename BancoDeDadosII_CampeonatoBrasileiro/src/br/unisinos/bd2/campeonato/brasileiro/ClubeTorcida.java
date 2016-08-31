package br.unisinos.bd2.campeonato.brasileiro;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class ClubeTorcida implements Serializable 
{

	// Atributos
	private static final long serialVersionUID = 1L;

	// TODO: Clube
	
	@ManyToOne (optional = false)
	private TorcidaOrganizada torcidaOrganizada;
	
	// Metodos
	
}
