package br.com.fiap.anotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//Define at� quando a anota��o estar� presente (c�digo fonte, compila��o, execu��o) 
@Retention(RetentionPolicy.RUNTIME)
//Define onde pode ser utilizada a anota��o (Field - atributos)
@Target({ElementType.FIELD, ElementType.METHOD})
public @interface Coluna {
	
	String nome();
	int tamanho() default 0;
	boolean obrigatorio() default false;
	
}