package br.com.fiap.jpa.view;

import javax.persistence.EntityManager;

import br.com.fiap.jpa.dao.BibliotecaDao;
import br.com.fiap.jpa.dao.BibliotecaDaoImpl;
import br.com.fiap.jpa.dao.EnderecoDao;
import br.com.fiap.jpa.dao.EnderecoDaoImpl;
import br.com.fiap.jpa.entity.Biblioteca;
import br.com.fiap.jpa.entity.Endereco;
import br.com.fiap.jpa.exception.IdNaoEncontradoException;
import br.com.fiap.jpa.singleton.EntityManagerFactorySingleton;

public class ExemploPesquisa {

	public static void main(String[] args) {
		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
		BibliotecaDao dao = new BibliotecaDaoImpl(em);
		
		try {
			Biblioteca b = dao.buscar(1);
			System.out.println(b.getNome());
			//System.out.println(b.getEndereco().getLogradouro());
		} catch (IdNaoEncontradoException e) {
			System.out.println(e.getMessage());
		}
		
//		EnderecoDao endDao = new EnderecoDaoImpl(em);
//		
//		try {
//			//Pesquisar um endereco pelo ID
//			Endereco end = endDao.buscar(1);
//			//Exibir o logradouro e o nome da biblioteca
//			System.out.println(end.getLogradouro());
//			//System.out.println(end.getBiblioteca().getNome());
//		} catch (IdNaoEncontradoException e) {
//			System.out.println(e.getMessage());
//		}
		
	}
}