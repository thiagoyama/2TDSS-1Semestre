package br.com.fiap.view;

import java.util.Calendar;
import java.util.GregorianCalendar;

import br.com.fiap.bean.ContaCorrente;
import br.com.fiap.bean.ContaPoupanca;
import br.com.fiap.bean.TipoConta;

public class View {

	public static void main(String[] args) {
		//Instanciar uma conta corrente
		Calendar data = new GregorianCalendar(2021, Calendar.JANUARY, 10);
		ContaCorrente cc = new ContaCorrente(1, 123, data, 1000, TipoConta.COMUM);
				
		//Instanciar uma conta poupança
		ContaPoupanca cp = new ContaPoupanca(1,321, Calendar.getInstance(), 100, 1);
		
		//Chamar o método retirar da conta corrente
		
		
		//Criar uma lista de conta corrente
		
		//Adicionar 3 contas
		
		//Exibir os saldos das contas
		
	}
}