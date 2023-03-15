package br.com.fiap.view;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.entity.Cliente;

public class TesteRemover {
	
	//Remover o cliente de codigo x
	public static void main(String[] args) {
		//Criar a fabrica
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("CLIENTE_ORACLE");
		//Criar o Entity Manager
		EntityManager em = fabrica.createEntityManager();
		
		//Pesquisar o cliente que sera removido
		Cliente cliente = em.find(Cliente.class, 1);
		
		//Chamar o método remover
		em.remove(cliente);
		
		em.getTransaction().begin();
		em.getTransaction().commit();
	}
}
