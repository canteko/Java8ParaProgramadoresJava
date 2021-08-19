package apistream;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class EjemploCreacionStreams {

	public static void main(String[] args) {
		// Un stream a partir de elementos
		Stream<Integer> stream1 = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		
		// Stream a partir de un array
		IntStream stream2 = Arrays.stream(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
		
		// Stream vacio
		Stream<String> stream3 = Stream.empty();
		
		// Stream infinito
		Stream<Integer> stream4 = Stream.iterate(1, x -> x + 2);
		
		// Stream de 100 elementos
		Stream<Integer> stream5 = Stream.iterate(0, x -> x + 2).limit(100);
		
		// Stream a partir de una coleccion
		Stream<String> stream6 = Arrays.asList("En", "un", "lugar", "de", "La", "Mancha").parallelStream();
		
		// Stream a partir de un Supplier<T>
		Stream<Integer> stream7 = Stream.generate(new Random()::nextInt);

	}

}
