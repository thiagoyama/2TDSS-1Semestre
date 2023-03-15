package br.com.fiap.view;

import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import br.com.fiap.entity.Cliente;
import br.com.fiap.entity.Genero;

public class TesteCadastro {

	public static void main(String[] args) {
		//Instanciar um Cliente sem o ID (pode criar o construtor)
		Cliente cliente = new Cliente("Gondo", new GregorianCalendar(1980, Calendar.JANUARY, 1), 
																	100.0, "2112332154", Genero.MASCULINO);
		//Instaciar uma fabrica de Entity Manager
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("CLIENTE_ORACLE");
		
		//Criar o Entity Manager
		EntityManager em = fabrica.createEntityManager();
		
		//Chamar o m�todo persist() do Entity Manager
		em.persist(cliente);
		
		//Transa��o - Commit
		em.getTransaction().begin();
		em.getTransaction().commit();
		
		System.out.println("Cliente cadastrado!");
	}
}