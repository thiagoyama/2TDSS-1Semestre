package br.com.fiap.view;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import javax.persistence.EntityManager;

import br.com.fiap.dao.PacoteDao;
import br.com.fiap.dao.TransporteDao;
import br.com.fiap.dao.impl.PacoteDaoImpl;
import br.com.fiap.dao.impl.TransporteDaoImpl;
import br.com.fiap.entity.Pacote;
import br.com.fiap.entity.Transporte;
import br.com.fiap.singleton.EntityManagerFactorySingleton;

public class Pesquisas {

	public static void main(String[] args) {
		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
		
		PacoteDao pacoteDao = new PacoteDaoImpl(em);
		
		//Listar todos os pacotes
		List<Pacote> pacotes = pacoteDao.listar(2,2);
		for(Pacote p: pacotes) {
			System.out.println(p.getDescricao());
		}
		
		System.out.println("Buscar pacote por preço");
		pacotes = pacoteDao.buscarPorPrecoMenor(5000);
		for (Pacote p: pacotes) {
			System.out.println(p.getDescricao() + " " + p.getPreco());
		}

		//Pesquisar o transporte
		TransporteDao transporteDao = new TransporteDaoImpl(em); 
		Transporte transporte = transporteDao.pesquisar(3);
		
		//Pesquisar o pacote pelo transporte
		System.out.println("Buscar pacote por transporte");
		pacotes = pacoteDao.buscarPorTransporte(transporte);
		for (Pacote p: pacotes) {
			System.out.println(p.getDescricao() + " " 
										+ p.getTransporte().getEmpresa());
		}
		
		//Pesquisar pacotes por data de saida
		System.out.println("Buscar pacote por data de saida");
		Calendar inicio = new GregorianCalendar(2020, Calendar.JANUARY, 1);
		Calendar fim = new GregorianCalendar(2021, Calendar.DECEMBER, 1);
		pacotes = pacoteDao.buscarPorDatas(inicio, fim);
		for (Pacote p: pacotes) {
			System.out.println(p.getDescricao());
		}
		
		//Somar os pre�os dos pacotes por um transporte
		transporte = transporteDao.pesquisar(3);
		double soma = pacoteDao.somarPrecoPorTransporte(transporte);
		System.out.println("A soma dos pre�o �: " + soma);
		
		//Pesquisar pacotes com preco maior do que 1000
		pacotes = pacoteDao.buscarPorPrecoMaior(1000);
		System.out.println("Pacotes com preco maior");
		pacotes.forEach(p -> System.out.println(p.getDescricao()));
		
	}//main
}//class

