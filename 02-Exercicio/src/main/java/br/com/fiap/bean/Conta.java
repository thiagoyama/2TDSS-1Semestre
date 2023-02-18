package br.com.fiap.bean;

import java.util.Calendar;

import br.com.fiap.exception.SaldoInsuficienteException;

//Classe abstrata: A estrutura para as classes filhas 
//Não pode ser instanciada e pode conter métodos abstratos (sem implementação)
public abstract class Conta {

	private int numero;
	private int agencia;
	private Calendar dataAbertura;
	protected double saldo;
	
	//Construtores (CTRL + 3 -> gcuf)
	public Conta() {}
	
	public Conta(int numero, int agencia, Calendar dataAbertura, double saldo) {
		this.numero = numero;
		this.agencia = agencia;
		this.dataAbertura = dataAbertura;
		this.saldo = saldo;
	}
	
	//Métodos
	public void depositar(double valor) {
		saldo += valor;
	}
	
	public abstract void retirar(double valor) throws SaldoInsuficienteException;
	
	//CTRL + 3 -> ggas (Getters e Setters)
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public Calendar getDataAbertura() {
		return dataAbertura;
	}
	public void setDataAbertura(Calendar dataAbertura) {
		this.dataAbertura = dataAbertura;
	}
	public double getSaldo() {
		return saldo;
	}
}