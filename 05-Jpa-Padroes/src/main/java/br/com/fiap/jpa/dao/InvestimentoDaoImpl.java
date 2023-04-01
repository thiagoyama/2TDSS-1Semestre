package br.com.fiap.jpa.dao;

import javax.persistence.EntityManager;

import br.com.fiap.jpa.entity.Investimento;

public class InvestimentoDaoImpl extends GenericDaoImpl<Investimento, Integer> implements InvestimentoDao {

	public InvestimentoDaoImpl(EntityManager em) {
		super(em);
	}
	
}