package br.com.fiap.dao;

import javax.persistence.EntityManager;

import br.com.fiap.entity.Consulta;
import br.com.fiap.entity.ConsultaPk;
import br.com.fiap.jpa.dao.GenericDaoImpl;

public class ConsultaDaoImpl extends GenericDaoImpl<Consulta, ConsultaPk> implements ConsultaDao {

	public ConsultaDaoImpl(EntityManager em) {
		super(em);
	}

}
