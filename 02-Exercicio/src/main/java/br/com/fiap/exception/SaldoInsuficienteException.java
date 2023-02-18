package br.com.fiap.exception;

public class SaldoInsuficienteException extends Exception {

	private static final long serialVersionUID = 1L;

	public SaldoInsuficienteException(String msg){
		super(msg);
	}
	
	public SaldoInsuficienteException(double saldo) {
		super("Saldo insuficiente, saldo disponível: R$" + saldo);
	}
	
}
