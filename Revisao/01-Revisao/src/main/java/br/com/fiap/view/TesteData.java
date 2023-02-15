package br.com.fiap.view;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class TesteData {

	public static void main(String[] args) {
		// Obter uma instancia de Calendar com a data atual
		Calendar hoje = Calendar.getInstance();

		// Obter uma instancia de Calendar com a data 28/02/2023
		Calendar data = new GregorianCalendar(2023, Calendar.FEBRUARY, 28);

		//Criar o objeto que formata a data
		SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		// Exibir a data
		System.out.println(formatador.format(hoje.getTime()));
		
		// Exibir a data
		System.out.println(formatador.format(data.getTime()));

	}
}