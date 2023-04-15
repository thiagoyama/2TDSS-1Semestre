package br.com.fiap.jpa.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
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

	//nome do atributo que mapeia a FK
	@OneToOne(mappedBy = "endereco", fetch = FetchType.LAZY) 
	private Biblioteca biblioteca;
	
	public Endereco() {}
	
	public Endereco(String logradouro, String cep) {
		this.logradouro = logradouro;
		this.cep = cep;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public Biblioteca getBiblioteca() {
		return biblioteca;
	}

	public void setBiblioteca(Biblioteca biblioteca) {
		this.biblioteca = biblioteca;
	}
	
}
