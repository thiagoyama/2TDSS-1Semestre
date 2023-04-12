package br.com.fiap.jpa.view;

import javax.persistence.EntityManager;

import br.com.fiap.jpa.dao.EnderecoDao;
import br.com.fiap.jpa.dao.EnderecoDaoImpl;
import br.com.fiap.jpa.singleton.EntityManagerFactorySingleton;

public class ExemploPesquisa {

	public static void main(String[] args) {
		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
		EnderecoDao endDao = new EnderecoDaoImpl(em);
		
		//Pesquisar um endereço pelo ID
		
		
		//Exibir o logradouro e o nome da biblioteca
		
	}
}