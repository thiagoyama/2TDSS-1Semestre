package br.com.fiap.model;

import br.com.fiap.anotation.Coluna;

public class Pessoa {

	@Coluna(nome = "nm_pessoa", obrigatorio = true, tamanho = 100)
	private String nome;
	
	@Coluna(nome = "nr_idade", obrigatorio = true)
	private int idade;
	
	@Coluna(nome = "vl_altura")
	private float altura;
	
	public void andar() {
		System.out.println("Pessoa andando");
	}
	
	//getters e setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}
	
}