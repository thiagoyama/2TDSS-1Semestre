package br.com.fiap.jpa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="TB_ENDERECO")
@SequenceGenerator(name="end", sequenceName = "SQ_TB_ENDERECO", allocationSize = 1)
public class Endereco {

	@Id
	@Column(name="cd_endereco")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "end")
	private Integer codigo;

	@Column(name="ds_logradouro", nullable = false, length = 100)
	private String logradouro;
	
	@Column(name="nr_cep",  nullable = false, length = 9)
	private String cep;
	
}
