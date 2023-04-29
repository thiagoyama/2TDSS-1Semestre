package br.com.fiap.exercicio.dao.impl;

import javax.persistence.EntityManager;

import br.com.fiap.exercicio.dao.UsuarioDao;
import br.com.fiap.exercicio.entity.Usuario;
import br.com.fiap.jpa.dao.GenericDaoImpl;

public class UsuarioDaoImpl extends GenericDaoImpl<Usuario, Integer> implements UsuarioDao {

	public UsuarioDaoImpl(EntityManager em) {
		super(em);
	}

}
