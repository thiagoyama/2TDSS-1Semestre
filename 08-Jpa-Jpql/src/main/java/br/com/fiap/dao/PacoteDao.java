package br.com.fiap.dao;

import java.util.Calendar;
import java.util.List;

import br.com.fiap.entity.Pacote;
import br.com.fiap.entity.Transporte;

public interface PacoteDao extends GenericDao<Pacote,Integer>{

	//Listar todos os pacotes
	List<Pacote> listar();
	
	List<Pacote> buscarPorPrecoMenor(float preco);
	
	List<Pacote> buscarPorTransporte(Transporte transporte);
	
	List<Pacote> buscarPorDatas(Calendar inicio, Calendar fim);
	
	Double somarPrecoPorTransporte(Transporte transporte);
	
	List<Pacote> buscarPorPrecoMaior(float preco);
	
}