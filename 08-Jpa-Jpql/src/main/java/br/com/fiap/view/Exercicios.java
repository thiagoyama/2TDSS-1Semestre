package br.com.fiap.view;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.fiap.dao.ClienteDao;
import br.com.fiap.dao.impl.ClienteDaoImpl;
import br.com.fiap.entity.Cliente;
import br.com.fiap.singleton.EntityManagerFactorySingleton;

public class Exercicios {

	public static void main(String[] args) {
		//Instanciar o EntityManager
		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
		
		//Instanciar o ClienteDao
		ClienteDao clienteDao = new ClienteDaoImpl(em);
		
		//Buscar os clientes por parte do nome
		List<Cliente> clientes = clienteDao.buscarPorNome("a");
		
		//Exibir os nomes dos clientes
		for (Cliente c : clientes) {
			System.out.println(c.getNome());
		}
		
		//Buscar os clientes por estado
		clientes = clienteDao.buscarPorEstado("PR");
		System.out.println("Buscar cliente por estado");
		for (Cliente c: clientes) {
			System.out.println(c.getNome() + " "
							+ c.getEndereco().getCidade().getUf());
		}
		
		//Buscar os clientes por dias de reserva
		clientes = clienteDao.buscarPorDiasReserva(10);
		System.out.println("Buscar cliente por dias de reserva");
		for (Cliente c: clientes) {
			System.out.println(c.getNome());
		}
		
	}//main
}//class