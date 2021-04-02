package myFirstProject;

import myFirstProject.module.Conta;

public class Main {
	
	public static void main(String [] args) {
		Conta conta = new Conta();
		conta.adicionarNumeroDaConta(7777);
		conta.depositar(258);
		
		System.out.println(conta.getNumeroDaConta());
		System.out.println(conta.getSaldo());
	}
}
