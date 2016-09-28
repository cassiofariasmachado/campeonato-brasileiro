package br.unisinos.bd2.campeonato.brasileiro.jpa.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

public class Rodadas implements Serializable{
	
	// Atributos
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO, generator = "rodadasSeq")
	@SequenceGenerator (name = "rodadasSeq", sequenceName = "s_Rodadas", allocationSize = 1)
	private Long idRodada;
	
	@ManyToOne (optional = false)
	private Campeonato campeonato;
	
	@ManyToOne(optional = false)
	private Jogador artilheiro;
	
	@Column (nullable = true)
	private int totalJogos;
	
	@Column (nullable = true)
	private int totalAmarelos;
	
	@Column (nullable = true)
	private int totalVermelhos;
	
	@Column (nullable = true)
	private int totalGols;
	
	//Métodos
	public Long getIdRodada() {
		return idRodada;
	}

	public void setIdRodada(Long idRodada) {
		this.idRodada = idRodada;
	}

	public void setArtilheiro(Jogador artilheiro) {
		this.artilheiro = artilheiro;
	}
	
	
}
