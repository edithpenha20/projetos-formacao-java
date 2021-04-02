package br.com.alura;

public class Funcionario {
	
	private String nome;
	private int idade;
		
	//Contructor -->> CTRL+3 -> Quick Access -> gcuf
	public Funcionario(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return this.idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

		
	
}
