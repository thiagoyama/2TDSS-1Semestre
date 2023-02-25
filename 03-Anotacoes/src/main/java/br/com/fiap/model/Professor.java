package br.com.fiap.model;

public class Professor extends Pessoa {

	@Override //garantir que o método está sobrescrevendo
	@SuppressWarnings("all") //Retira os alertas (amarelinho)
	//@Deprecated //define que o método está obsoleto e não deve ser utilizado
	public void andar() {
		System.out.println("Professor andando");
		int x = 123;
	}
	
}