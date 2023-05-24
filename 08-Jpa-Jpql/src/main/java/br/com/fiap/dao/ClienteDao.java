package br.com.fiap.dao;

import java.util.Calendar;
import java.util.List;

import br.com.fiap.entity.Cliente;

public interface ClienteDao extends GenericDao<Cliente,Integer>{

	List<Cliente> buscarPorNome(String nome);
	
	List<Cliente> buscarPorEstado(String estado);
	
	List<Cliente> buscarPorDiasReserva(int dias);
	
	List<Cliente> buscar(String nome, String cidade);
	
	List<Cliente> buscarPorEstados(List<String> estados);
	
	Long contarPorEstado(String estado);
	
	Cliente buscarPorCpf(String cpf);
	
	List<Cliente> buscarPorDataNascimento(Calendar inicio, Calendar fim);
	
}