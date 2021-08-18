package interfazfuncional.conocidos;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;

public class EjemploFuncional {

	public static void main(String[] args) {
		List<String> lista = Arrays.asList("En", "un", "lugar", "de", "La", "Mancha");
		
		Collections.sort(lista, new Comparator<String>() {
			@Override
			public int compare(String compare1, String compare2) {
				return compare1.length() - compare2.length();
			}
		});
		
		Collections.sort(lista, (compare1, compare2) -> compare1.length() - compare2.length());
		lista.forEach(System.out::println);

	}

}
