package br.com.fiap.exercicio.dao.impl;

import javax.persistence.EntityManager;

import br.com.fiap.exercicio.dao.CasoTesteDao;
import br.com.fiap.exercicio.entity.CasoTeste;
import br.com.fiap.jpa.dao.GenericDaoImpl;

public class CasoTesteDaoImpl extends GenericDaoImpl<CasoTeste, Integer> implements CasoTesteDao {

	public CasoTesteDaoImpl(EntityManager em) {
		super(em);
	}

}
