package br.com.alura;

import java.util.*;

public class TesteEmptySet {

	public static void main(String[] args) {

        Set<String> nomes = Collections.emptySet();
        nomes.add("Paulo"); //o que acontece aqui?
        
        System.out.println(nomes);
        //Set<Aluno> alunosSincronizados = Collections.synchronizedSet(alunos);
    }
}
