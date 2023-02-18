package br.com.fiap.model;

import java.util.List;

public class Churros extends Doce {

	private String sabor;
	
	private boolean recheado;
	
	public Churros(List<String> ingredientes) {
		super(ingredientes);
	}
	
	//Construtor com a lista de ingredientes e o sabor
	public Churros(List<String> ingredientes, String sabor) {
		super(ingredientes);
		this.sabor = sabor;
	}

	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

	public boolean isRecheado() {
		return recheado;
	}

	public void setRecheado(boolean recheado) {
		this.recheado = recheado;
	}
	
}
