package br.com.fiap.exercicio.view;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import br.com.fiap.exercicio.dao.SistemaDao;
import br.com.fiap.exercicio.dao.impl.SistemaDaoImpl;
import br.com.fiap.exercicio.entity.CasoTeste;
import br.com.fiap.exercicio.entity.ItemTeste;
import br.com.fiap.exercicio.entity.Sistema;
import br.com.fiap.exercicio.entity.Usuario;
import br.com.fiap.jpa.exception.CommitException;
import br.com.fiap.jpa.singleton.EntityManagerFactorySingleton;

public class Cadastro {

	//Cadastrar todas as entidades relacionadas
	public static void main(String[] args) {
		//Instanciar um Sistema com nome
		Sistema sistema = new Sistema("Portal FIAP");
		
		//Instanciar dois Casos de Teste com nome e descricao
		CasoTeste caso1 = new CasoTeste("Notas", "Publicação de notas");
		CasoTeste caso2 = new CasoTeste("Aprovação", "Aprovação de alunos");
		
		//Adicionar os casos de teste no sistema
		sistema.addCasoTeste(caso1);
		sistema.addCasoTeste(caso2);
		
		//Instanciar dois Itens de Teste com descricao
		ItemTeste item1 = new ItemTeste("Publicar a nota depois de validar");
		ItemTeste item2 = new ItemTeste("Aprovar o aluno com media maior do que 7");
		
		//Adicionar os itens de testes no caso de teste
		caso1.addItemTeste(item1);
		caso2.addItemTeste(item2);
		
		//Instanciar um usuário com nome
		Usuario usuario  = new Usuario("Admin");
		
		//Criar uma lista de usuario para adicionar no item de teste
		List<Usuario> usuarios = new ArrayList<Usuario>();
		usuarios.add(usuario);
		
		//Setar a lista de usuario no item de teste
		item1.setUsuarios(usuarios);
		item2.setUsuarios(usuarios);

		//Cadastrar o sistema, o resto vai em cascata!
		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
		SistemaDao dao = new SistemaDaoImpl(em);
		try {
			dao.salvar(sistema);
			dao.commit();
		} catch (CommitException e) {
			e.printStackTrace();
		}
	}
}