package br.com.fiap.view;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.entity.Cliente;
import br.com.fiap.entity.Genero;

public class TesteAtualizacao {

	public static void main(String[] args) {
		//Instanciar um Cliente com um Id valido
		Cliente cliente  = new Cliente("2berto", 
				new GregorianCalendar(2003, Calendar.OCTOBER, 11), 
				1.0, "1115646546", Genero.MASCULINO);
		
		cliente.setId(24);
		
		//Criar a fabrica
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("CLIENTE_ORACLE");
		
		//Criar o Entity Manager
		EntityManager em = fabrica.createEntityManager();
		
		//Atualizar o cliente no banco de dado
		Cliente copiaGerenciada = em.merge(cliente);
		
		em.getTransaction().begin();
		em.getTransaction().commit();
		
		copiaGerenciada.setNome("1berto");
		
		em.getTransaction().begin();
		em.getTransaction().commit();
		
		System.out.println("Cliente atualizado!");
	}
}