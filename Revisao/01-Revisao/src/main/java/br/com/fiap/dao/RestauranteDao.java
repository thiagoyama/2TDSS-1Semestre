package br.com.fiap.dao;

import java.util.List;

import br.com.fiap.model.Restaurante;

public interface RestauranteDao {
	
	void cadastrar(Restaurante restaurante);
	
	List<Restaurante> listar();
}
