package enumeraciones.clases;

public class EjemploPlanetas {

	public static void main(String[] args) {

		double pesoEnLaTierra = 75.0;
		double masaEnLaTierra = 75.0 / Planeta.TIERRA.gravedadSuperficial();
		
		for(Planeta planeta : Planeta.values()) {
			System.out.printf("Su peso en %s es %f%n", planeta, planeta.pesoEnLaSuperficie(masaEnLaTierra));
		}
	}

}
