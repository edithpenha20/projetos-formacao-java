package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

import java.util.List;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayListEquals {

	public static void main(String[] args) {
		
//		Conta cc1 = new ContaCorrente(22, 11);
//		Conta cc2 = new ContaCorrente(22, 22);
//		
//		boolean igual = cc1.ehIgual(cc2);
//		System.out.println(igual);
		
		//Generics <tipoDo Array>
		List <Conta> lista = new Vector<Conta>();//threadsafe
				
		Conta cc = new ContaCorrente(22, 11);
		lista.add(cc);
				
		Conta cc2 = new ContaCorrente(22, 22);
		lista.add(cc2);
		
		Conta cc3 = new ContaCorrente(22, 22);
		boolean existe = lista.contains(cc3);
		System.out.println("Já exite: " + existe);
		
		for(Conta conta : lista) {
			System.out.println(conta);
		}
				
//		for(Conta oRef : lista) {
//			System.out.println(oRef);
//		}

	}

}
