package br.com.fiap.model;

public class Professor extends Pessoa {

	@Override //garantir que o m�todo est� sobrescrevendo
	@SuppressWarnings("all") //Retira os alertas (amarelinho)
	//@Deprecated //define que o m�todo est� obsoleto e n�o deve ser utilizado
	public void andar() {
		System.out.println("Professor andando");
		int x = 123;
	}
	
}