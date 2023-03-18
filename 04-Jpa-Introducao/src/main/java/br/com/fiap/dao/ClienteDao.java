package br.com.fiap.dao;

import br.com.fiap.entity.Cliente;
import br.com.fiap.exception.CommitException;
import br.com.fiap.exception.IdNaoEncontradoException;

public interface ClienteDao {

	void cadastrar(Cliente cliente);
	
	void atualizar(Cliente cliente) throws IdNaoEncontradoException;
	
	void remover(int id) throws IdNaoEncontradoException;
	
	Cliente buscarPorId(int id) throws IdNaoEncontradoException;
	
	void commit() throws CommitException;
	
}