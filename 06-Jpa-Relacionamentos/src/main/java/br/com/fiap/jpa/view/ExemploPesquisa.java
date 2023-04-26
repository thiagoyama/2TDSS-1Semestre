package br.com.fiap.jpa.view;

import javax.persistence.EntityManager;

import br.com.fiap.jpa.dao.BibliotecaDao;
import br.com.fiap.jpa.dao.BibliotecaDaoImpl;
import br.com.fiap.jpa.entity.Biblioteca;
import br.com.fiap.jpa.entity.Livro;
import br.com.fiap.jpa.exception.IdNaoEncontradoException;
import br.com.fiap.jpa.singleton.EntityManagerFactorySingleton;

public class ExemploPesquisa {

	public static void main(String[] args) {
		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
		BibliotecaDao dao = new BibliotecaDaoImpl(em);
		
		try {
			Biblioteca b = dao.buscar(39);
			System.out.println(b.getNome());
			System.out.println(b.getEndereco().getLogradouro());
			//Exibir os livros da biblioteca e a editora de cada livro
			for (Livro livro :b.getLivros()) {
				System.out.println(livro.getTitulo() + " " + 
						livro.getEditora().getNome());
			}
			
		} catch (IdNaoEncontradoException e) {
			System.out.println(e.getMessage());
		}
	}
}