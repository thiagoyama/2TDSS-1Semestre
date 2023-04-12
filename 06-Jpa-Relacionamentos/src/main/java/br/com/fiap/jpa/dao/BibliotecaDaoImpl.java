package br.com.fiap.jpa.dao;

import javax.persistence.EntityManager;

import br.com.fiap.jpa.entity.Biblioteca;

public class BibliotecaDaoImpl 
			extends GenericDaoImpl<Biblioteca, Integer> 
										implements BibliotecaDao{

	public BibliotecaDaoImpl(EntityManager em) {
		super(em);
	}

}
