package myFirstProject.module;

public class Conta {
	private int numeroDaconta; //modificador public permite acessar os atributos dessa classe em qualquer lugar da aplicação
	private double saldo;
	
	public void adicionarNumeroDaConta(int numeroDaConta) {
		if (numeroDaConta > 0) {
			this.numeroDaconta = numeroDaConta;
		} else {
			System.out.println("O número da conta é inválido");
		}
		
	}
	
	public void depositar(double valor) {
		if (valor > 0) {
			this.saldo += valor;
		} else {
			System.out.println("O número da conta é inválido");
		}
		
	}
	
	public int getNumeroDaConta() {
		return this.numeroDaconta;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public void imprimir() {
		System.out.println("Numero da conta: " + this.numeroDaconta);
		System.out.println("Saldo da conta: " + this.saldo);
	}
}
