package polimorfismo.interfaz;

public class Herencia {

	public static void main(String[] args) {
		Base b = new Nieta();
		Hija h = new Nieta();
		Nieta n = new Nieta();
		
		b.saludar("Hola");
		h.saludar("Hola");
		n.saludar("Hola");
	}

}
