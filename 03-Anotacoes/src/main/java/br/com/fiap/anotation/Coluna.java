package br.com.fiap.anotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//Define até quando a anotação estará presente (código fonte, compilação, execução) 
@Retention(RetentionPolicy.RUNTIME)
//Define onde pode ser utilizada a anotação (Field - atributos)
@Target({ElementType.FIELD, ElementType.METHOD})
public @interface Coluna {
	
	String nome();
	int tamanho() default 0;
	boolean obrigatorio() default false;
	
}