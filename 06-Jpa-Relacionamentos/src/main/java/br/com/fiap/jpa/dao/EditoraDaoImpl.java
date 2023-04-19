package br.com.fiap.jpa.dao;

import javax.persistence.EntityManager;

import br.com.fiap.jpa.entity.Editora;

public class EditoraDaoImpl extends GenericDaoImpl<Editora, Integer> implements EditoraDao{

	public EditoraDaoImpl(EntityManager em) {
		super(em);
	}

}
