package clasegenerica.basico;

public class EjemploBasico {
	
	public static void main(String[] args) {
		Par<Integer, String> par = new Par<>(5, "Hola");
		
		System.out.println(par);

		Par<String, String> par2 = new Par<>("Colega", "Hola");
		
		System.out.println(par2);
	}
}
