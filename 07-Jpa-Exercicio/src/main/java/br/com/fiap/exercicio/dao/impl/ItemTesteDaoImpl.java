package br.com.fiap.exercicio.dao.impl;

import javax.persistence.EntityManager;

import br.com.fiap.exercicio.dao.ItemTesteDao;
import br.com.fiap.exercicio.entity.ItemTeste;
import br.com.fiap.jpa.dao.GenericDaoImpl;

public class ItemTesteDaoImpl extends GenericDaoImpl<ItemTeste, Integer> implements ItemTesteDao {

	public ItemTesteDaoImpl(EntityManager em) {
		super(em);
	}

}
