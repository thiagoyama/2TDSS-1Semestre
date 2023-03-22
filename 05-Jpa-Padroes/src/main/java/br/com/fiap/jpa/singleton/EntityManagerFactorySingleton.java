package br.com.fiap.jpa.singleton;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerFactorySingleton {

	// 1-Atributo estatico que armazena a unica instancia
	private static EntityManagerFactory unico;

	// 2-Construtor privado // new EntityManagerFactorySingleton()
	private EntityManagerFactorySingleton() {}

	// 3-Metodo estatico que cria e retorna a instancia se necessario
	public static EntityManagerFactory getInstance() {
		if (unico == null)
			unico = Persistence.createEntityManagerFactory("CLIENTE_ORACLE");
		return unico;
	}

}