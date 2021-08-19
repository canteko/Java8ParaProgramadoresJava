package apistream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.function.IntUnaryOperator;
import static java.util.stream.Collectors.*;

public class EjemploOperacionesFiltradoMapeoYForeachStreams {

	public static void main(String[] args) {
		List<String> capitales = Arrays.asList("Huelva", "Sevilla", "Cordoba", "Jaen", "Cadiz", "Malaga", "Granada", "Almeria");
		Stream<String> capitalesParalelStream = capitales.parallelStream();
		Stream<String> capitalesStream = capitales.stream();
		
		// Capitales que empiecen por C
		Stream<String> capitalesConC = capitales.stream().filter(s -> s.startsWith("C"));

		List<String> capitales2 = Arrays.asList("Huelva", "Sevilla", "Sevilla");
		Stream<String> capitalesSinRepetir = capitales2.stream().distinct();
		
		
		Stream<String> capitales5 = capitales.stream().limit(5);
		Stream<String> capitales4 = capitales.stream().skip(4);
		
		System.out.println(capitales4);
		
		
		//Mapeos
		Stream<String> capitales6 = capitales.stream().map(String::toUpperCase);
		IntStream capitales7 = capitales.stream().mapToInt(String::length);
		
		
		// Foreach
		capitalesConC.forEach(System.out::println);
		System.out.println("");
		capitalesSinRepetir.forEach(System.out::println);
		System.out.println("");
		capitales5.forEach(System.out::println);
		System.out.println("");
		capitales4.forEach(System.out::println);
		System.out.println("");
		capitales6.forEach(System.out::println);
		System.out.println("");
		capitales7.forEach(System.out::println);
		
		// Buscador y comprobar
		boolean matches = capitalesStream.allMatch(s -> s.length() > 4);
		boolean matchesJaen = capitalesParalelStream.anyMatch(s -> s.equalsIgnoreCase("jaen"));
		boolean matchesNone = capitales.stream().noneMatch(s -> s.length() > 4);
		
		// FindAny (Para paralelos) o FindFirst (Para no paralelos)
		Optional<String> paralel = capitales.parallelStream().findAny();
		Optional<String> secuential = capitales.stream().findFirst();
		
		System.out.println(paralel.orElse("NADA"));
		System.out.println(secuential.orElse("NADA"));
		
		int [] array = generateRandomArray();
		System.out.println(Arrays.toString(array));
		
		OptionalInt max = Arrays.stream(array).max();
		OptionalInt min = Arrays.stream(array).min();
		
		System.out.println(max.getAsInt());
		System.out.println(Arrays.toString(Arrays.stream(array).sorted().toArray()));
		
		// Filtrar en lista de lista para que el contenido sea uno solo
		List<List<String>> listOfList = Arrays.asList((Arrays.asList("1", "2", "3", "HOLA")), (Arrays.asList("6", "2", "3", "HO5A")), (Arrays.asList("143", "6", "355", "HOLA234")));
		
		listOfList
			.stream()
			.flatMap(arrayFromList -> arrayFromList.stream())
			.distinct()
			.forEach(System.out::println);
		
		int[][] numeros = {{1, 2, 3, 4, 1, 3, 2}, {5, 3, 1, 3, 2, 1, 5}};
		
		Arrays
			.stream(numeros)
			.flatMapToInt(x -> Arrays.stream(x))
			.map(IntUnaryOperator.identity())
			.distinct()
			.forEach(System.out::println);
		
	}
	
	public static int[] generateRandomArray() {
		return new Random().ints(100, 0, 1000).toArray();
	}

}
