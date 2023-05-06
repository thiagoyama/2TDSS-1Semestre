package br.com.fiap.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import br.com.fiap.dao.PacoteDao;
import br.com.fiap.entity.Pacote;
import br.com.fiap.entity.Transporte;

public class PacoteDaoImpl extends GenericDaoImpl<Pacote,Integer> implements PacoteDao{

	public PacoteDaoImpl(EntityManager entityManager) {
		super(entityManager);
	}

//	public List<Pacote> listar() {
//		//Criar o comando JQPL 
//		TypedQuery<Pacote> query = em.createQuery("from Pacote", Pacote.class);
//		//Executar o comando 
//		return query.getResultList();
//	}

	public List<Pacote> buscarPorPrecoMenor(float preco) {
//		//Criar o comando JPQL
//		TypedQuery<Pacote> query = em.createQuery(
//				"from Pacote p where p.preco < :p", Pacote.class);
//		//Setar o parametro do comando
//		query.setParameter("p", preco);
//		return query.getResultList();
		return em.createQuery("from Pacote p where p.preco < :p", Pacote.class)
				.setParameter("p", preco)
				.getResultList();
	}

	public List<Pacote> buscarPorTransporte(Transporte transporte) {
		// TODO Auto-generated method stub
		return null;
	}

}