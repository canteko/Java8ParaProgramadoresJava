package clases.anonimas;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortAnonimo {

	public static void main(String[] args) {
		List<Integer> lista = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		lista.sort(new Comparator<Integer>() {
			@Override
			public int compare(Integer arg0, Integer arg1) {
				return -arg0.compareTo(arg1);
			}

		});
		
		for(Integer i : lista) {
			System.out.println(i);
		}
	}

}
