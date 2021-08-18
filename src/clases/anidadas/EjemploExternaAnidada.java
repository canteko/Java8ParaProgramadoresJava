package clases.anidadas;

public class EjemploExternaAnidada {

	public static void main(String[] args) {
		Externa.AnidadaEstatica ae = new Externa.AnidadaEstatica("estatic");
		
		// No podemos hacer lo mismo con la que no es estatica
//		Externa.Anidada a = new Externa.Anidada("estatic");
		Externa.Anidada a = new Externa(1).new Anidada("non estatic");
		Externa a1 = new Externa(3);
		Externa.Anidada a2 = a1.new Anidada("non estatic");

		System.out.println(a.getN());
		System.out.println(a1.getN());
		System.out.println(a2.getN());
	}

}
