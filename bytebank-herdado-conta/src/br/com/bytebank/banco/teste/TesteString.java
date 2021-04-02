package br.com.bytebank.banco.teste;

public class TesteString {

	public static void main(String[] args) {
		
		int a = 3;
		
		String nome = "Alura";
		//String outro = new String("Alura"); --->mesma coisa que o de cima, só que não é uma forma usada

		String outra = nome.replace("A","a");
		String palavraMinuscula = nome.toLowerCase();
		String palavraMaiuscula = nome.toUpperCase();
		char c = nome.charAt(0);
		int pos = nome.indexOf("ur");
		String sub = nome.substring(1);
		String vazio = "      Alura      ";
		String outroVazio = vazio.trim();
		
		
		System.out.println(nome);
		System.out.println(outra);
		System.out.println(palavraMinuscula);
		System.out.println(palavraMaiuscula);
		System.out.println(c);
		System.out.println(pos);
		System.out.println(sub);
		System.out.println(nome.length());
		System.out.println(vazio.isEmpty());
		System.out.println(vazio);
		System.out.println(outroVazio);
		System.out.println(outroVazio.contains("Alu"));
		
	}

}
