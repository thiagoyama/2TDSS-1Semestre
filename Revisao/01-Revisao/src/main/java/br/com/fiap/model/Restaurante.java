package br.com.fiap.model;

import java.util.Calendar;

public class Restaurante {
	
	private String nome;
	
	private int capacidade;
	
	private Calendar dataAbertura;
	
	private Culinaria culinaria;
	
	//Criar um construtor com nome, dataAbertura e culinaria
	public Restaurante(String nome, 
				Calendar dataAbertura, Culinaria culinaria) {
		this.nome = nome;
		this.dataAbertura = dataAbertura;
		this.culinaria = culinaria;
	}
	
	public Restaurante(String nome) {
		this.nome = nome;
	}
	
	public Restaurante() {}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getCapacidade() {
		return capacidade;
	}
	
	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

	public Calendar getDataAbertura() {
		return dataAbertura;
	}

	public void setDataAbertura(Calendar dataAbertura) {
		this.dataAbertura = dataAbertura;
	}

	public Culinaria getCulinaria() {
		return culinaria;
	}

	public void setCulinaria(Culinaria culinaria) {
		this.culinaria = culinaria;
	}
	
}
