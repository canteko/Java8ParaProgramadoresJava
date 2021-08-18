package interfazfuncional.nuevos;

@FunctionalInterface
public interface MiInterfaz {
	void print(String str);
	
	boolean equals(Object o);
	
	default void defecto() {
		System.out.println("Metodo con implementacion por defecto");
	}
	
	static void estatico() {
		System.out.println("Metodo con implementacion estatico");		
	}
}
