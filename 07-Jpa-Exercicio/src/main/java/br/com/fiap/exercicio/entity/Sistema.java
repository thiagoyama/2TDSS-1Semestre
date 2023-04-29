package br.com.fiap.exercicio.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="TAB_SISTEMA")
@SequenceGenerator(name="sistema", sequenceName = "SQ_TAB_SISTEMA", allocationSize = 1)
public class Sistema {

	@Id
	@Column(name="cod_sistema")
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "sistema")
	private Integer codigo;
	
	@Column(name="nom_sistema")
	private String nome;
	
	//Relacionamento 1:N
	@OneToMany(mappedBy = "sistema", cascade = CascadeType.ALL)
	private List<CasoTeste> casosTestes = new ArrayList<CasoTeste>();
	
	public void addCasoTeste(CasoTeste caso) {
		//Adicionar na lista de casos teste
		casosTestes.add(caso);
		//Setar o sistema (FK) no caso teste
		caso.setSistema(this);
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

	public List<CasoTeste> getCasosTestes() {
		return casosTestes;
	}

	public void setCasosTestes(List<CasoTeste> casosTestes) {
		this.casosTestes = casosTestes;
	}
	
}