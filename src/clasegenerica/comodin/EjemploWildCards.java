package clasegenerica.comodin;

import java.util.Arrays;
import java.util.List;

public class EjemploWildCards {

	public static void main(String[] args) {
		List<Integer> listaEntera = Arrays.asList(1, 2, 3, 4, 5);
		System.out.printf("La suma de la lista entera es %.0f %n%n", sumOfList(listaEntera));

		List<Float> listaReal = Arrays.asList(1.4f, 2.4f, 3f, 4.9f, 5f);
		System.out.printf("La suma de la lista entera es %.2f %n%n", sumOfList(listaReal));
		
	}
	
	public static double sumOfList(List<? extends Number> lista) {
		double sum = 0;
		for (Number n : lista) {
			sum += n.doubleValue();
		}
		return sum;
	}

}
