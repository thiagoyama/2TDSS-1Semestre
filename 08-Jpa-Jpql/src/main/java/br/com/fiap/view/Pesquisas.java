package br.com.fiap.view;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.fiap.dao.PacoteDao;
import br.com.fiap.dao.impl.PacoteDaoImpl;
import br.com.fiap.entity.Pacote;
import br.com.fiap.singleton.EntityManagerFactorySingleton;

public class Pesquisas {

	public static void main(String[] args) {
		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
		
		PacoteDao pacoteDao = new PacoteDaoImpl(em);
		
		//Listar todos os pacotes
		List<Pacote> pacotes = pacoteDao.listar();
		for(Pacote p: pacotes) {
			System.out.println(p.getDescricao());
		}
		
		System.out.println("Buscar pacote por preço");
		pacotes = pacoteDao.buscarPorPrecoMenor(5000);
		for (Pacote p: pacotes) {
			System.out.println(p.getDescricao() + " " + p.getPreco());
		}
		
	}
}