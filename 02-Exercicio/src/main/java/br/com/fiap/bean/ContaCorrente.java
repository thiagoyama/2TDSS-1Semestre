package br.com.fiap.bean;

import java.util.Calendar;

import br.com.fiap.exception.SaldoInsuficienteException;

public class ContaCorrente extends Conta {

	private TipoConta tipo;
	
	public ContaCorrente() {}
	
	public ContaCorrente(int numero, int agencia, Calendar dataAbertura, double saldo, TipoConta tipo) {
		super(numero, agencia, dataAbertura, saldo);
		this.tipo = tipo;
	}

	@Override
	public void retirar(double valor) throws SaldoInsuficienteException {
		if (tipo == TipoConta.COMUM && valor > saldo) {
			throw new SaldoInsuficienteException(saldo);
		}
		saldo -= valor;
	}

	public TipoConta getTipo() {
		return tipo;
	}

	public void setTipo(TipoConta tipo) {
		this.tipo = tipo;
	}

}
