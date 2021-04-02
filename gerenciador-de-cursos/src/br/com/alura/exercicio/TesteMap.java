package br.com.alura.exercicio;

import java.util.*;
import java.util.Map.Entry;

public class TesteMap {

	public static void main(String[] args) {
		
		Map<String, Integer> nomesParaIdade = new HashMap<>();
        nomesParaIdade.put("Paulo", 31);
        nomesParaIdade.put("Adriano", 25);
        nomesParaIdade.put("Alberto", 33);
        nomesParaIdade.put("Guilherme", 26);
        
//        Set<String> chaves = nomesParaIdade.keySet();    
//        for (String nome : chaves) {
//            System.out.println(nome);
//        }
//        
//        Collection<Integer> valores = nomesParaIdade.values();
//        for (Integer idade : valores) {
//            System.out.println(idade);
//        }
        
        Set<Entry<String, Integer>> associaNome = nomesParaIdade.entrySet();    
        for (Entry<String, Integer> associacao : associaNome) {
            System.out.println(associacao.getKey() + " - " + associacao.getValue());
        }

	}

}
