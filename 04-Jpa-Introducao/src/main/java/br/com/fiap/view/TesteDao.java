package br.com.fiap.view;

import java.util.Calendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.dao.ClienteDao;
import br.com.fiap.dao.ClienteDaoImpl;
import br.com.fiap.entity.Cliente;
import br.com.fiap.entity.Genero;
import br.com.fiap.exception.IdNaoEncontradoException;

public class TesteDao {

	//Implementar o CRUD com o DAO
	public static void main(String[] args) {
		//Criar a fabrica
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("CLIENTE_ORACLE");
		
		//Criar o Entity manager
		EntityManager em = fabrica.createEntityManager();
		
		//Instanciar o DAO
		ClienteDao dao = new ClienteDaoImpl(em);
		
		//Cadastrar um Cliente
		Cliente cliente = new Cliente("Ruan", Calendar.getInstance(), 100.0,
				"1231313", Genero.MASCULINO);
		
		try {
			dao.cadastrar(cliente);
			dao.commit();
			System.out.println("Cliente cadastrado");
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		//Pesquisar um Cliente
		try {
			Cliente busca = dao.buscarPorId(1);
			System.out.println(busca.getNome());
		} catch (IdNaoEncontradoException e) {
			System.out.println(e.getMessage());
		}
		
		//Atualizar um Cliente
		try {
			cliente.setNome("Lívia");
			cliente.setGenero(Genero.FEMININO);
			dao.atualizar(cliente);
			dao.commit();
			System.out.println("Cliente atualizado!");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		//Remover um Cliente
		try {
			dao.remover(21);
			dao.commit();
			System.out.println("Cliente removido!");
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}