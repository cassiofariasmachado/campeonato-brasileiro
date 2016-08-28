package br.unisinos.bd2.campeonato.brasileiro;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Tecnico implements Serializable  {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue  (strategy = GenerationType.AUTO, generator = "tecnicoSeq")
	@SequenceGenerator (name = "tecnicoSeq", sequenceName = "s_Sequence", allocationSize = 1)
	private Long idTecnico;
	
	@Column (length = 50, nullable = true)
	private String nome;
}
