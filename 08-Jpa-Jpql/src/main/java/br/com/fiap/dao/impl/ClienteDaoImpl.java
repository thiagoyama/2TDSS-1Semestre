package br.com.fiap.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.fiap.dao.ClienteDao;
import br.com.fiap.entity.Cliente;

public class ClienteDaoImpl extends GenericDaoImpl<Cliente,Integer> implements ClienteDao{

	public ClienteDaoImpl(EntityManager entityManager) {
		super(entityManager);
	}

	//Pesquisar o cliente por parte do nome, permitir no máximo 2 nomes
	public List<Cliente> buscarPorNome(String nome) {
		return em.createQuery("from Cliente c where c.nome like :n", Cliente.class)
				.setParameter("n", "%" + nome + "%")
				.setMaxResults(2) //máximo de resultados (2))
				.getResultList();
	}

	public List<Cliente> buscarPorEstado(String estado) {
		return em.createQuery("from Cliente c where c.endereco.cidade.uf = :e", Cliente.class)
				.setParameter("e", estado)
				.getResultList();
	}
	
	public List<Cliente> buscarPorDiasReserva(int dias) {
		return em.createQuery("select r.cliente from Reserva r where r.numeroDias = :d", Cliente.class)
				.setParameter("d", dias)
				.getResultList();
	}

}
