package br.com.fiap.view;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.dao.ClienteDao;
import br.com.fiap.dao.ClienteDaoImpl;

public class TesteDao {

	//Implementar o CRUD com o DAO
	public static void main(String[] args) {
		//Criar a fabrica
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("CLIENTE_ORACLE");
		
		//Criar o Entity manager
		EntityManager em = fabrica.createEntityManager();
		
		//Instanciar o DAO
		ClienteDao dao = new ClienteDaoImpl(em);
		
		//Cadastrar um Cliente
		
		
		//Pesquisar um Cliente
		
		
		//Atualizar um Cliente
		
		
		//Remover um Cliente
		
	}
}