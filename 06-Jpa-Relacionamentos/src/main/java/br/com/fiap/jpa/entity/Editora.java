package br.com.fiap.jpa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="TB_EDITORA")
@SequenceGenerator(name="editora", sequenceName = "SQ_TB_EDITORA", allocationSize = 1)
public class Editora {

	@Id
	@Column(name="cd_editora")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "editora")
	private Integer codigo;
	
	@Column(name="nm_editora", nullable = false, length = 80)
	private String nome;
	
}