package polimorfismo.interfaz;

public interface Base {

	default public void saludar(String saludo) {
		System.out.println(saludo + " desde Base");
	}
}
