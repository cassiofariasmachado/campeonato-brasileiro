package br.unisinos.bd2.campeonato.brasileiro;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Diretor {
	
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO, generator = "diretorSeq")
	@SequenceGenerator (name = "diretorSeq", sequenceName = "s_Diretor", allocationSize = 1)
	private Long idDiretor;
	
	@Column (length = 50, nullable = true)
	private String nome;
	
}