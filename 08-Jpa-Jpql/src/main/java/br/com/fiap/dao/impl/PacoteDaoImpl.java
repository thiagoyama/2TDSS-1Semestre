package br.com.fiap.dao.impl;

import java.util.Calendar;
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
		return em.createQuery("from Pacote p where p.transporte = :t", Pacote.class)
				.setParameter("t", transporte)
				.getResultList();
	}

	public List<Pacote> buscarPorDatas(Calendar inicio, Calendar fim) {
		return em.createQuery("from Pacote p where p.dataSaida between :i and :f", Pacote.class)
				.setParameter("i", inicio)
				.setParameter("f", fim)
				.getResultList();
	}

	public Double somarPrecoPorTransporte(Transporte transporte) {
		return em.createQuery("select sum(p.preco) from Pacote p where p.transporte = :t", Double.class)
				.setParameter("t", transporte)
				.getSingleResult();
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<Pacote> buscarPorPrecoMaior(float preco) {
		return em.createNativeQuery
				("select * from tb_ead_pacote where vl_pacote >= :preco", Pacote.class)
				.setParameter("preco", preco)
				.getResultList();
	}

}



