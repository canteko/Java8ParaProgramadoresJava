package clases.locales;

public class EjemploLocales {

	public static void main(String[] args) {
		Persona p1 = new Persona("Pepe", "Perez", "12345678B");
		Persona p2 = new Persona("Pepe", "Perez", "12345678Z");

		System.out.println(Persona.validarNif(p1.getNif()) ? "DNI Valido" : "DNI no valido");
		System.out.println(Persona.validarNif(p2.getNif()) ? "DNI Valido" : "DNI no valido");
		
	}

}
