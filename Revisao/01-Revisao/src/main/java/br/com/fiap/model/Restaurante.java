package br.com.fiap.model;

public class Restaurante {
	
	private String nome;
	private int capacidade;
	
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
	
}
