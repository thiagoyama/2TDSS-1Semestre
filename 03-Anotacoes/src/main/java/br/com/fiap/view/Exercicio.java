package br.com.fiap.view;

import br.com.fiap.dao.JpaDao;
import br.com.fiap.model.Aluno;
import br.com.fiap.model.Pessoa;

public class Exercicio {

	public static void main(String[] args) {
		//Instanciar um aluno
		Aluno aluno = new Aluno();
		//Instanciar um JpaDao
		JpaDao dao = new JpaDao();
		//Chamar o método pesquisar passando o aluno
		dao.pesquisar(aluno);
		
		Pessoa pessoa = new Pessoa();
		dao.pesquisar(pessoa);
		
	}
}