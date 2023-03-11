package br.com.fiap.view;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import br.com.fiap.entity.Cliente;

public class TestePesquisa {

	public static void main(String[] args) {
		//Criar a fabrica de entity manager
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("CLIENTE_ORACLE");
		
		//Criar o entity manager
		EntityManager em = fabrica.createEntityManager();
		
		//Pesquisar um cliente pela PK
		Cliente cliente = em.find(Cliente.class, 1);
		
		//Exibir o nome do cliente
		System.out.println(cliente.getNome());
		
		cliente.setNome("Parducci");
		
		//commit
		em.getTransaction().begin();
		em.getTransaction().commit();
	}
}
