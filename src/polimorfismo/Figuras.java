package polimorfismo;

import java.util.ArrayList;
import java.util.List;

public class Figuras {

	public static void main(String[] args) {
		List<Rectangulo> figuras = new ArrayList<>();

		figuras.add(new Cuadrado(5));
		figuras.add(new Rectangulo(5, 6));
		
	}

}
