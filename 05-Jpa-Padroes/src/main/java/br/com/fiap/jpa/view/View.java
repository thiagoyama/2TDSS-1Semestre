package br.com.fiap.jpa.view;

import javax.persistence.EntityManager;

import br.com.fiap.jpa.dao.InvestimentoDao;
import br.com.fiap.jpa.dao.InvestimentoDaoImpl;
import br.com.fiap.jpa.singleton.EntityManagerFactorySingleton;

public class View {

	public static void main(String[] args) {
		//Obter o entity manager
		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();

		//Instanciar o DAO do investimento
		InvestimentoDao dao = new InvestimentoDaoImpl(em);
		
		//cadastrar
		
		//pesquisar
		
		//remover um investimento
		
	}	
}