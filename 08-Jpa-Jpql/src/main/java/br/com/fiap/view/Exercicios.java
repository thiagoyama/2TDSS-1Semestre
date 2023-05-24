package br.com.fiap.view;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.logging.Level;

import javax.persistence.EntityManager;

import br.com.fiap.dao.ClienteDao;
import br.com.fiap.dao.impl.ClienteDaoImpl;
import br.com.fiap.entity.Cliente;
import br.com.fiap.singleton.EntityManagerFactorySingleton;

public class Exercicios {

	public static void main(String[] args) {
		
		java.util.logging.Logger.getLogger("org.hibernate").setLevel(Level.OFF);
		
		//Instanciar o EntityManager
		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
		
		//Instanciar o ClienteDao
		ClienteDao clienteDao = new ClienteDaoImpl(em);
		
		//Buscar os clientes por parte do nome
		List<Cliente> clientes = clienteDao.buscarPorNome("A");
		
		//Exibir os nomes dos clientes
		System.out.println("Buscar clientes por nome");
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
		
		//Buscar os clientes por parte do nome e nome da cidade
		clientes = clienteDao.buscar("a", "Salva");
		System.out.println("Buscar cliente por nome e nome da cidade");
		//Exibir o nome e o nome da cidade
		for (Cliente c: clientes) {
			System.out.println(c.getNome() + " " + 
					c.getEndereco().getCidade().getNome());
		}
		
		System.out.println("Buscar clientes por estados");
		List<String> estados = new ArrayList<String>();
		estados.add("BA");
		estados.add("PR");
		//Pesquisar e exibir o nome e o estado
		clientes = clienteDao.buscarPorEstados(estados);
		for (Cliente c : clientes) {
			System.out.println(c.getNome() + " " + 
					c.getEndereco().getCidade().getUf());
		}
		
		//Contar a quantidade de clientes
		long qtd = clienteDao.contarPorEstado("SP");
		//Exibir a quantidade de clientes por estado (PR)
		System.out.println("Clientes por estado: " + qtd);
		
		//Pesquisar um cliente por CPF
		Cliente cliente = clienteDao.buscarPorCpf("50293494030");
		
		//Exibir o nome e o cpf do cliente
		System.out.println(cliente.getNome() + " " + cliente.getCpf());
		
		//Pesquisar cliente por data nascimento
		Calendar inicio = new GregorianCalendar(1990, Calendar.JANUARY, 1);
		Calendar fim = new GregorianCalendar(1990, Calendar.DECEMBER, 31);
		
		clientes = clienteDao.buscarPorDataNascimento(inicio, fim);
		
		clientes.forEach(c -> System.out.println(c.getNome()));
		
	}//main
}//class







