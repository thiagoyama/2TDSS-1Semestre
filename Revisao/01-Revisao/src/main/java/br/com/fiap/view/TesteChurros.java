package br.com.fiap.view;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import br.com.fiap.model.Churros;

public class TesteChurros {

	//Criar o método main
	public static void main(String[] args) {
		//Criar uma lista de Strings com os ingredientes
		List<String> ingredientes = new ArrayList<String>();
		//Adicionar os ingredientes na lista
		ingredientes.add("Fermento");
		ingredientes.add("Farinha");
		ingredientes.add("Açúcar");
		
		//Instanciar um Churros com os ingredientes e sabor
		Churros churros = new Churros(ingredientes, "Doce de leite com chocolate");
		
		//Exibir os ingredientes e o sabor do churros
		System.out.println(churros.getSabor());
		System.out.println("Ingredientes:");
		//Laço de repetição
		for (int i=0; i < churros.getIngredientes().size(); i++) {
			System.out.println(churros.getIngredientes().get(i));
		}
		
		//Instanciar um churros informando a lista de ingredientes e o nome
		//Criar um vetor de String e transformar em uma lista
		Churros churros2 = new Churros(Arrays.asList("Ovo", "Farinha", "Leite", "Catupiry"), "Hilda Furacão");
		
		System.out.println(churros2.getSabor());
		System.out.println("Ingredientes:");
		for (String ing : churros2.getIngredientes()) {
			System.out.println(ing);
		}
		
	}
}