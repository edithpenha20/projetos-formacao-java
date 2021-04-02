package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaAula2 {

	public static void main(String[] args) {
		
		Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");
		
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma AUla", 20));
		javaColecoes.adiciona(new Aula("Modelando Coleções", 24));
		
		//Aulas imutáveis
		List<Aula> aulasImutaveis = javaColecoes.getAulas();
		System.out.println(aulasImutaveis);
		
		//Aulas mutáveis
		List<Aula> aulas = new ArrayList<>(aulasImutaveis);
		
		//Ordenando as aulas
		Collections.sort(aulas);
		System.out.println(aulas);
		
		//Total de tempo das aulas
		System.out.println(javaColecoes.getTempoTotal());
		
		System.out.println(javaColecoes);

	}

}
