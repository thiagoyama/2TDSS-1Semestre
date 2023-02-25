package br.com.fiap.view;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import br.com.fiap.bean.ContaCorrente;
import br.com.fiap.bean.ContaPoupanca;
import br.com.fiap.bean.TipoConta;
import br.com.fiap.exception.SaldoInsuficienteException;

public class View {

	public static void main(String[] args) {
		//Instanciar uma conta corrente
		Calendar data = new GregorianCalendar(2021, Calendar.JANUARY, 10);
		ContaCorrente cc = new ContaCorrente(1, 123, data, 1000, TipoConta.COMUM);
				
		//Instanciar uma conta poupança
		ContaPoupanca cp = new ContaPoupanca(1,321, Calendar.getInstance(), 100, 1);
		
		//Chamar o método retirar da conta corrente
		try {
			cc.retirar(10000);
			System.out.println("Saque realizado, saldo disponível: " + cc.getSaldo());
		}catch(SaldoInsuficienteException e) {
			System.err.println(e.getMessage());
		}
		
		//Criar uma lista de conta corrente
		List<ContaCorrente> lista = new ArrayList<ContaCorrente>();

		//Adicionar 3 contas
		lista.add(cc);
		lista.add(new ContaCorrente(123, 312, data, 500, TipoConta.ESPECIAL));
		lista.add(new ContaCorrente(123, 222, Calendar.getInstance(), 50, TipoConta.PREMIUM));
		
		//Exibir os saldos das contas
		for (ContaCorrente item : lista) {
			System.out.println(item.getSaldo());
		}
		
	}
}