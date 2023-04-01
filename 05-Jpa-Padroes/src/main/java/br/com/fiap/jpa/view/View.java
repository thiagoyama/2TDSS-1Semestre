package br.com.fiap.jpa.view;

import javax.persistence.EntityManager;
import br.com.fiap.jpa.dao.InvestimentoDao;
import br.com.fiap.jpa.dao.InvestimentoDaoImpl;
import br.com.fiap.jpa.entity.Investimento;
import br.com.fiap.jpa.entity.TipoInvestimento;
import br.com.fiap.jpa.exception.CommitException;
import br.com.fiap.jpa.exception.IdNaoEncontradoException;
import br.com.fiap.jpa.singleton.EntityManagerFactorySingleton;

public class View {

	public static void main(String[] args) {
		//Obter o entity manager
		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();

		//Instanciar o DAO do investimento
		//GenericDao<Investimento, Integer> dao = new GenericDaoImpl<Investimento, Integer>(em) {};
		InvestimentoDao dao = new InvestimentoDaoImpl(em);
		
		//Instanciar um investimento (implementar um construtor na classe)
		Investimento investimento = new Investimento("CDB Dogecoin", 1000.0, TipoInvestimento.CRIPTO);
		
		//cadastrar
		try {
			dao.salvar(investimento);
			dao.commit();
			System.out.println("Investimento cadastrado!");
		}catch(CommitException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			//Pesquisar
			Investimento busca = dao.buscar(1);
			System.out.println(busca.getNome());
		
			//Atualizar um investimento
			busca.setValor(5000.0);
			dao.salvar(busca);
			dao.commit();
			System.out.println("Investimento atualizado!");
		} catch (CommitException e) {
			System.out.println(e.getMessage());
		} catch (IdNaoEncontradoException e) {
			System.out.println(e.getMessage());
		}
		
		//remover um investimento
		try {
			dao.remover(2);
			dao.commit();
			System.out.println("Investimento removido");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}	
}