package br.com.fiap.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.fiap.dao.ClienteDao;
import br.com.fiap.entity.Cliente;

public class ClienteDaoImpl extends GenericDaoImpl<Cliente,Integer> implements ClienteDao{

	public ClienteDaoImpl(EntityManager entityManager) {
		super(entityManager);
	}

	//Pesquisar o cliente por parte do nome
	public List<Cliente> buscarPorNome(String nome) {
		return em.createQuery("from Cliente c where c.nome like :n", Cliente.class)
				.setParameter("n", "%" + nome + "%")
				.getResultList();
	}

}
