package br.com.fiap.dao.impl;

import java.util.Calendar;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TemporalType;

import br.com.fiap.dao.ClienteDao;
import br.com.fiap.entity.Cliente;

public class ClienteDaoImpl extends GenericDaoImpl<Cliente,Integer> implements ClienteDao{

	public ClienteDaoImpl(EntityManager entityManager) {
		super(entityManager);
	}

	//Pesquisar o cliente por parte do nome, permitir no m�ximo 2 nomes
	public List<Cliente> buscarPorNome(String nome) {
		return em.createQuery("from Cliente c where upper(c.nome) like upper(:n)", Cliente.class)
				.setParameter("n", "%" + nome + "%")
				.setMaxResults(2) //maximo de resultados (2))
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

	public List<Cliente> buscar(String nome, String cidade) {
		return em.createQuery("from Cliente c where c.nome like :n "
				+ "and c.endereco.cidade.nome like :c", Cliente.class)
				.setParameter("n", "%" + nome + "%")
				.setParameter("c", "%" + cidade + "%")
				.getResultList();
	}

	public List<Cliente> buscarPorEstados(List<String> estados) {
		return em.createQuery("from Cliente c where "
				+ "c.endereco.cidade.uf in :e", Cliente.class)
				.setParameter("e", estados)
				.getResultList();
	}

	public Long contarPorEstado(String estado) {
		return em.createQuery("select count(c) from Cliente c where c.endereco.cidade.uf = :D", Long.class )
				.setParameter("D", estado)
				.getSingleResult();
	}

	public Cliente buscarPorCpf(String cpf) {
		return em.createNamedQuery("Cliente.PorCpf", Cliente.class)
				.setParameter("churros", cpf)
				.getSingleResult();
	}

	public List<Cliente> buscarPorDataNascimento(Calendar inicio, Calendar fim) {
		return em.createNamedQuery("Cliente.PorDataNascimento", Cliente.class)
				.setParameter("i", inicio)
				.setParameter("f", fim)
				.getResultList();
	}

}





