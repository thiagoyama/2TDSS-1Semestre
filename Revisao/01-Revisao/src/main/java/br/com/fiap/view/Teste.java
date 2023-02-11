package br.com.fiap.view;

import br.com.fiap.dao.RestauranteDao;
import br.com.fiap.dao.RestauranteDaoJdbc;
import br.com.fiap.dao.RestauranteDaoJpa;
import br.com.fiap.model.Restaurante;

public class Teste {
	
	public static void main(String[] args) {
		
		Restaurante restaurante = new Restaurante("FIAP Tratoria");
		
		 if(!restaurante.getNome().equals("FIAP Tratoria"))
			 System.out.println("Dont have");
		 else
			 System.out.println("O nome do restaurante is FIAP Tratoria");
		 
		 System.out.println(restaurante.getNome().equals("FIAP Tratoria")?"Sim":"Nao");
		 
		 RestauranteDao dao = new RestauranteDaoJpa();
		 
//		  RestauranteDao dao = new RestauranteDaoJdbc();
	}

}
