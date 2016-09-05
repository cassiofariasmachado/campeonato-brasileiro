package br.unisinos.bd2.campeonato.brasileiro;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Patrocinador {
	
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO, generator = "patrocinadorSeq")
	@SequenceGenerator (name = "patrocinadorSeq", sequenceName = "s_patrocinador", allocationSize = 1)
	private Long idPatrocinador;
	
	@Column (length = 50, nullable = true)
	private String name;
	
}
