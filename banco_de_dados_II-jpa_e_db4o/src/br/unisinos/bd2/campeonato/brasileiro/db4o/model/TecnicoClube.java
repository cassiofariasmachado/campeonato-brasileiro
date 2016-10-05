package br.unisinos.bd2.campeonato.brasileiro.db4o.model;

public class TecnicoClube {
	
	// Atributos
	private Long idTecnicoClube;
	private Clube idClube;
 	private Tecnico idTecnico;
	
 	// Construtor
 	public TecnicoClube(Long idTecnicoClube, Clube idClube, Tecnico idTecnico) {
		super();
		this.idTecnicoClube = idTecnicoClube;
		this.idClube = idClube;
		this.idTecnico = idTecnico;
	}
 	
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
