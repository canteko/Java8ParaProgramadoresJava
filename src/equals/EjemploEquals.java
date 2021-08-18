package equals;

public class EjemploEquals {

	public static void main(String[] args) {
		Coche mercedes = new Coche("Mercedes", "Caro", "220CV");
		Coche otroMercedes = new Coche("Mercedes", "Caro", "220CV");
		Coche kia = new Coche("Kia", "Picanto", "60CV");

		System.out.println(mercedes.equals(otroMercedes) ? "mm iguales" : "mm distintos");
		System.out.println(mercedes.equals(kia) ? "mm iguales" : "mm distintos");		
		System.out.println("m1 " + mercedes);
		System.out.println("m2 " + otroMercedes);
		System.out.println("m3 " + kia);
		otroMercedes = mercedes;
		System.out.println(mercedes.equals(otroMercedes) ? "mm iguales" : "mm distintos");
		System.out.println("m1 " + mercedes);
		System.out.println("m2 " + otroMercedes);
		System.out.println("m3 " + kia);
		
		Persona pmercedes = new Persona("Mercedes");
		Persona otraPmercedes = new Persona("Mercedes");
		Persona john = new Persona();
		
		System.out.println(pmercedes.equals(otraPmercedes) ? "mm iguales" : "mm distintos");
		System.out.println(mercedes.equals(john) ? "mm iguales" : "mm distintos");		
		otraPmercedes = pmercedes;
		System.out.println(pmercedes.equals(otraPmercedes) ? "mm iguales" : "mm distintos");
	}

}
