package br.com.fiap.exercicio.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="TAB_USUARIO")
@SequenceGenerator(name="usuario", sequenceName = "SQ_TAB_USUARIO", allocationSize = 1)
public class Usuario {

	@Id
	@Column(name="cod_usuario")
	@GeneratedValue(generator = "usuario", strategy = GenerationType.SEQUENCE)
	private Integer codigo;
	
	@Column(name="nom_usuario")
	private String nome;
	
	@ManyToMany(mappedBy = "usuarios")
	private List<ItemTeste> itensTestes;
	
	public Usuario() {}

	public Usuario(String nome) {
		this.nome = nome;
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

	public List<ItemTeste> getItensTestes() {
		return itensTestes;
	}

	public void setItensTestes(List<ItemTeste> itensTestes) {
		this.itensTestes = itensTestes;
	}
	
}
