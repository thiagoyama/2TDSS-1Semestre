package br.com.fiap.view;

import java.util.Calendar;
import java.util.GregorianCalendar;

import br.com.fiap.model.Culinaria;
import br.com.fiap.model.Restaurante;

public class TesteRestaurante {

	//Método main
	public static void main(String[] args) {
		//Obter uma data
		Calendar data = new GregorianCalendar(2020, Calendar.JANUARY, 1);
		
		//Instanciar um restaurante com nome, data e culinaria
		Restaurante r = new Restaurante("Comida de ontem",
										data, Culinaria.INDIANA_JONES);
		
		//Validar se o restaurante é INDIANA_JONES
		if (r.getCulinaria() == Culinaria.INDIANA_JONES)
			System.out.println("Culinaria INDIANA");
		
		//Exibir a culinária
		System.out.println(r.getCulinaria());
	}
}



