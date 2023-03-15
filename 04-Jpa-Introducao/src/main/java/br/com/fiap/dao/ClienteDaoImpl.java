package br.com.fiap.dao;

import javax.persistence.EntityManager;

import br.com.fiap.entity.Cliente;

public class ClienteDaoImpl implements ClienteDao {

	private EntityManager em;
	
	public ClienteDaoImpl(EntityManager em) {
		this.em = em;
	}
	
	public void cadastrar(Cliente cliente) {
		
	}

	public void atualizar(Cliente cliente) {
		
	}

	public void remover(int id) {
		
	}

	public Cliente buscarPorId(int id) {
		return null;
	}

	

}
