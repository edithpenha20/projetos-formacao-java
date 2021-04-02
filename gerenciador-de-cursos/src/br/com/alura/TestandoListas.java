package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {

	public static void main(String[] args) {
		
		String aula1 = "Conhecendo mais de Listas";
		String aula2 = "Modelando a classe aula";
		String aula3 = "Trabalhando com cursos e sets";
		
		ArrayList<String> aulas = new ArrayList <>();
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);
		
//		System.out.println(aulas);
//		
//		aulas.remove(0);
//		System.out.println(aulas);
//		
//		for (String aula : aulas) {
//			System.out.println("Aulas: " + aula);
//		}
//		
//		String primeiraAula = aulas.get(0);
//		System.out.println("A primeira aula é: " + primeiraAula);
//		
//		for (int i = 0; i < aulas.size(); i++) {
//			System.out.println("Aulas: " + aulas.get(i));
//		}
//		
//		System.out.println(aulas.size());
		
//		aulas.forEach(aula -> {
//			System.out.println("Percorrendo aula: " + aula);
//		});
		
		aulas.add("Aumentan nosso conhecimento");
		System.out.println(aulas);
		
		Collections.sort(aulas);
		System.out.println(aulas);

	}

}
