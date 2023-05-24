package br.com.fiap.view;

import java.time.LocalDate;
import java.util.Calendar;

import javax.persistence.EntityManager;

import br.com.fiap.dao.ConsultaDao;
import br.com.fiap.dao.ConsultaDaoImpl;
import br.com.fiap.entity.Consulta;
import br.com.fiap.entity.Medico;
import br.com.fiap.entity.Paciente;
import br.com.fiap.jpa.exception.CommitException;
import br.com.fiap.jpa.singleton.EntityManagerFactorySingleton;

public class Main {

	public static void main(String[] args) throws CommitException {

		// Instanciar o EntityManager
		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
		ConsultaDao dao = new ConsultaDaoImpl(em);
		
		Medico medico = new Medico();
		medico.setNome("Drauzio");
		
		Paciente paciente = new Paciente();
		paciente.setNome("Jaelson");
		
		Consulta consulta = new Consulta();
		consulta.setMedico(medico);
		consulta.setPaciente(paciente);
		consulta.setData(Calendar.getInstance());
		consulta.setReceita("AS");
		
		dao.salvar(consulta);
		dao.commit();
		
	}
}
