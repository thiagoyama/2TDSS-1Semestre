package br.com.fiap.dao;

import java.util.List;

import br.com.fiap.entity.Pacote;

public interface PacoteDao extends GenericDao<Pacote,Integer>{

	//Listar todos os pacotes
	List<Pacote> listar();
	
	List<Pacote> buscarPorPrecoMenor(float preco);
	
}