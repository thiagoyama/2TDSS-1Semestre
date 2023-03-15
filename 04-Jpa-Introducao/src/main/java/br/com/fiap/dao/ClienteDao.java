package br.com.fiap.dao;

import br.com.fiap.entity.Cliente;

public interface ClienteDao {

	void cadastrar(Cliente cliente);
	
	void atualizar(Cliente cliente);
	
	void remover(int id);
	
	Cliente buscarPorId(int id);
	
}