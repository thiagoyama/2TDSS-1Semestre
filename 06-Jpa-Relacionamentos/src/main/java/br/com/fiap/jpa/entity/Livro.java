package br.com.fiap.jpa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="TB_LIVRO")
@SequenceGenerator(name="livro", sequenceName = "SQ_TB_LIVRO", allocationSize = 1)
public class Livro {

	@Id
	@Column(name="cd_livro")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "livro")
	private Integer codigo;
	
	@Column(name="ds_titulo", nullable = false, length = 50)
	private String titulo;
	
	@Column(name="nr_pagina", precision = 5)
	private Integer numeroPaginas;
	
}
