package br.unisinos.bd2.campeonato.brasileiro.jpa.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class TecnicoClube {
	
	// Atributos
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO, generator = "tecnicoClubeSeq")
	@SequenceGenerator (name = "tecnicoClubeSeq", sequenceName = "s_TecnicoClube", allocationSize = 1)
	private Long idTecnicoClube;
	
	@ManyToOne (optional = false)
	private Clube idClube;
	
	@ManyToOne (optional = false)
 	private Tecnico idTecnico;
	
	// Métodos
 	public Long getIdTecnicoClube() {
		return idTecnicoClube;
	}
	public void setIdTecnicoClube(Long idTecnicoClube) {
		this.idTecnicoClube = idTecnicoClube;
	}
	public Clube getIdClube() {
		return idClube;
	}
	public void setIdClube(Clube idClube) {
		this.idClube = idClube;
	}
	public Tecnico getIdTecnico() {
		return idTecnico;
	}
	public void setIdTecnico(Tecnico idTecnico) {
		this.idTecnico = idTecnico;
	}
	
}
