package br.com.fiap.view;

import java.lang.reflect.Method;
import br.com.fiap.model.Pessoa;

public class Teste {

	public static void main(String[] args) {
		
		//Instanciar uma pessoa
		Pessoa pessoa = new Pessoa();
		
		//Recuperar o nome da classe atrav�s da API de Reflection
		String nomeClasse = pessoa.getClass().getName();
		System.out.println(nomeClasse);
		
		//Recuperar os m�todos da classe atrav�s da API de Reflection
		Method[] metodos = pessoa.getClass().getDeclaredMethods();
		
		//Exibir o nome dos m�todos
		for (Method m : metodos) {
			System.out.println(m.getName());
		}
		
		//Recuperar os atributos da classe
		//Exibir o nome e o tipo dos atributos
		
	}
}