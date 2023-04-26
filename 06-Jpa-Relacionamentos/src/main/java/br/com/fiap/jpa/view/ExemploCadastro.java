package br.com.fiap.jpa.view;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import javax.persistence.EntityManager;

import br.com.fiap.jpa.dao.BibliotecaDao;
import br.com.fiap.jpa.dao.BibliotecaDaoImpl;
import br.com.fiap.jpa.dao.EditoraDao;
import br.com.fiap.jpa.dao.EditoraDaoImpl;
import br.com.fiap.jpa.dao.EnderecoDao;
import br.com.fiap.jpa.dao.EnderecoDaoImpl;
import br.com.fiap.jpa.entity.Biblioteca;
import br.com.fiap.jpa.entity.Editora;
import br.com.fiap.jpa.entity.Endereco;
import br.com.fiap.jpa.entity.Livro;
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
			//Endereco salvo = enderecoDao.salvar(end);
			//Seta o endereco cadastrado no banco na biblioteca
			//b.setEndereco(salvo);
			//enderecoDao.commit();
			//Cadastrar a Biblioteca
			bibliotecaDao.salvar(b);
			bibliotecaDao.commit();
		} catch (CommitException e) {
			e.printStackTrace();
		}
		
		//Cadastrar um livro e uma editora
		//Instanciar 2 livros
		Livro cosmos = new Livro("Cosmos", 520);
		Livro harry = new Livro("Harry Potter e ", 500);
		
		//Instanciar a Editora
		Editora editora = new Editora("Atlas");
		
		editora.addLivro(harry);
		editora.addLivro(cosmos);
		
		//Cadastrar a editora e os livros em cascata
		EditoraDao editoraDao = new EditoraDaoImpl(em);
		try {
			editoraDao.salvar(editora);
			editoraDao.commit();
			System.out.println("Editora e livros cadastrados!");
		}catch(CommitException e) {
			System.err.println(e.getMessage());
		}
		
		//Cadastrar a relação N:M
		List<Livro> livros = new ArrayList<Livro>();
		livros.add(harry);
		livros.add(cosmos);
		
		b.setLivros(livros);
		
		try {
			bibliotecaDao.salvar(b);
			bibliotecaDao.commit();
			System.out.println("Deu certo!");
		} catch (CommitException e) {
			System.out.println(e.getMessage());
		}
		
	}//main
}//class