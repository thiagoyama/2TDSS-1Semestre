package br.com.fiap.jpa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="TB_INVESTIMENTO")
@SequenceGenerator(name="invs", sequenceName = "SQ_TB_INVESTIMENTO", allocationSize = 1)
public class Investimento {

	@Id
	@Column(name="cd_investimento")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "invs")
	private Integer codigo;
	
	@Column(name="nm_investimento", nullable = false, length = 50)
	private String nome;
	
	@Column(name="vl_investimento", precision = 10, scale = 2, nullable = false)
	private Double valor;
	
	@Enumerated(EnumType.STRING)
	@Column(name="ds_tipo", length = 40)
	private TipoInvestimento tipo;
	
	public Investimento() {}

	public Investimento(String nome, Double valor, TipoInvestimento tipo) {
		this.nome = nome;
		this.valor = valor;
		this.tipo = tipo;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public TipoInvestimento getTipo() {
		return tipo;
	}

	public void setTipo(TipoInvestimento tipo) {
		this.tipo = tipo;
	}
	
}