package br.com.fiap.model;

import java.util.List;

public class Doce {

	private List<String> ingredientes;
	
	private int tempoPreparo;
	
	//Criar um construtor com os ingredientes
	public Doce(List<String> ingredientes) {
		this.ingredientes = ingredientes;
	}

	public List<String> getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(List<String> ingredientes) {
		this.ingredientes = ingredientes;
	}

	public int getTempoPreparo() {
		return tempoPreparo;
	}

	public void setTempoPreparo(int tempoPreparo) {
		this.tempoPreparo = tempoPreparo;
	}
	
}