package br.com.alura;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class TestaAlunos {

	public static void main(String[] args) {
		
		//Collection é a classe mãe de de Set
		Collection<String> alunos = new HashSet<>();
		alunos.add("Rodrigo Turini");
		alunos.add("Alberto Souza");
		alunos.add("Nico Steppat");
		alunos.add("Sergio Lopes");
		alunos.add("Renan Saggio");
		alunos.add("Mauricio Aniche");
		alunos.add("Nico Steppat");
		
		boolean pauloEstaMatriculado = alunos.contains("Paulo Silveira");
		System.out.println(pauloEstaMatriculado);
		
		alunos.remove("Sergio Lopes");
		
		System.out.println("------------------");
		System.out.println(alunos.size());
		System.out.println("------------------");
		
		for (String aluno : alunos) {
			System.out.println(aluno);
		}
		
		System.out.println("------------------");
		System.out.println(alunos);
		
		//Posso usar outras Collections para aproveitar os métodos
		List<String> alunosEmLista = new ArrayList<>(alunos);

	}

}
