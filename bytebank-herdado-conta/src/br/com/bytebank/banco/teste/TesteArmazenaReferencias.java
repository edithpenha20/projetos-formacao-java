package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.ArmazenaContas;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArmazenaReferencias {

	public static void main(String[] args) {
		
		ArmazenaContas armazena = new ArmazenaContas();
		
		Conta cc = new ContaCorrente(22, 11);
		armazena.adiciona(cc);
		
		Conta cc2 = new ContaCorrente(22, 22);
		armazena.adiciona(cc2);
				
		int tamanho = armazena.getQuantidadeDeElementos();
		System.out.println(tamanho);
		
		Conta ref = armazena.getReferencia(0);
		System.out.println(ref.getNumero());

	}

}
