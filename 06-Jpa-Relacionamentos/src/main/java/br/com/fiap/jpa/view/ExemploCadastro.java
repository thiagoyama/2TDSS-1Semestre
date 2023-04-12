package br.com.fiap.jpa.view;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.persistence.EntityManager;

import br.com.fiap.jpa.dao.BibliotecaDao;
import br.com.fiap.jpa.dao.BibliotecaDaoImpl;
import br.com.fiap.jpa.dao.EnderecoDao;
import br.com.fiap.jpa.dao.EnderecoDaoImpl;
import br.com.fiap.jpa.entity.Biblioteca;
import br.com.fiap.jpa.entity.Endereco;
import br.com.fiap.jpa.exception.CommitException;
import br.com.fiap.jpa.singleton.EntityManagerFactorySingleton;

public class ExemploCadastro {

	public static void main(String[] args) {
		//Instanciar um Entity Manager
		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
		//Instanciar um EnderecoDao
		EnderecoDao enderecoDao = new EnderecoDaoImpl(em);
		//Instaciar uma BibliotecaDao
		BibliotecaDao bibliotecaDao = new BibliotecaDaoImpl(em);
		//Instanciar um Endereco
		Endereco end = new Endereco("Av Lins de Vasconcelos", "12312-12");
		//Instanciar uma Biblioteca
		Biblioteca b = new Biblioteca("FIAP", 
				new GregorianCalendar(1990, Calendar.JANUARY, 15), end);
		
		try {
			//Cadastrar o Endereco
			Endereco salvo = enderecoDao.salvar(end);
			//Seta o endereço cadastrado no banco na biblioteca
			b.setEndereco(salvo);
			//enderecoDao.commit();
			//Cadastrar a Biblioteca
			bibliotecaDao.salvar(b);
			bibliotecaDao.commit();
		} catch (CommitException e) {
			e.printStackTrace();
		}
	}
}