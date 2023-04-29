package br.com.fiap.exercicio.dao.impl;

import javax.persistence.EntityManager;

import br.com.fiap.exercicio.dao.SistemaDao;
import br.com.fiap.exercicio.entity.Sistema;
import br.com.fiap.jpa.dao.GenericDaoImpl;

public class SistemaDaoImpl extends GenericDaoImpl<Sistema, Integer> implements SistemaDao {

	public SistemaDaoImpl(EntityManager em) {
		super(em);
	}

}
