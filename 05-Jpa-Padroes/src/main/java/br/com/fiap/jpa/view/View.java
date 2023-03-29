package br.com.fiap.jpa.view;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.fiap.jpa.dao.GenericDao;
import br.com.fiap.jpa.singleton.EntityManagerFactorySingleton;

public class View {

	public static void main(String[] args) {
		//Obter uma fabrica
		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
//		EntityManagerFactory fabrica = EntityManagerFactorySingleton.getInstance();
//		EntityManager em = fabrica.createEntityManager();
		
	}	
}