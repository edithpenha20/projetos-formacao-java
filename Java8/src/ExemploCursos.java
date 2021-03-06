//Streams

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExemploCursos {
	public static void main(String[] args) {
		List<Cursos> cursos = new ArrayList<Cursos>();
		cursos.add(new Cursos("Python", 45));
		cursos.add(new Cursos("Javascript", 150));
		cursos.add(new Cursos("Java 8", 113));
		cursos.add(new Cursos("C", 55));
		
		cursos.sort(Comparator.comparingInt(c -> c.getAlunos()));
		//cursos.forEach(c -> System.out.println(c.getNome()));
		/*
		OptionalDouble media = cursos.stream()
			.filter(c -> c.getAlunos() >= 100)
			//.forEach(c -> System.out.println(c.getNome()));
			.mapToInt(c -> c.getAlunos())
			//.forEach(total -> System.out.println(total))
			.average();
			//.sum();
		System.out.println(media);
		*/
		
		Optional<Cursos> primeiroElemento = cursos.stream()
			.filter(c -> c.getAlunos() >= 50)
			.findFirst();
			//.forEach(c -> System.out.println(c.getNome()));
		primeiroElemento.ifPresent(c -> System.out.println(c.getNome()));
		
		/*
		Stream<String> nomes = cursos.stream().map(Cursos::getNome);
		nomes.forEach(System.out::println);
		
		cursos.stream()
			.filter(c -> c.getAlunos() >= 100)
			.findAny()
			.ifPresent(c -> System.out.println(c.getNome()));
		*/
		
		//cursos = cursos.stream()
			//.filter(c -> c.getAlunos() > 100)
			//.collect(Collectors.toList());
		
		cursos.stream()
				.filter(c -> c.getAlunos() > 100)
				.collect(Collectors.toMap(
						c -> c.getNome(),
						c -> c.getAlunos()))
				.forEach((nome, alunos) -> System.out.println(nome + " tem " + alunos + " alunos."));
		
		//cursos.stream()
			//.forEach(c -> System.out.println(c.getNome()));
		
	}
}
