package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.List;

public class TesteWrapperInteger {

	public static void main(String[] args) {
				
		int idade = 29; //refere-se ao objeto Integer
		
		Integer idadeRef = Integer.valueOf(29); //Autoboxing
		int valor = idadeRef.intValue(); //Unboxing
		System.out.println(idadeRef.doubleValue());
		
		System.out.println(idadeRef.MAX_VALUE);
		System.out.println(idadeRef.MIN_VALUE);
		
		System.out.println(Integer.SIZE);
		System.out.println(Integer.BYTES);
		
		String s = args[0];
		//Integer numero = Integer.valueOf(s);
		int numero = Integer.parseInt(s);
		System.out.println(numero);
		
		List <Integer> numeros = new ArrayList<Integer>();
		numeros.add(idade); //Autoboxing

	}

}
