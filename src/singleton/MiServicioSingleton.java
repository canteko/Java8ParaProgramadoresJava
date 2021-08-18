package singleton;

public class MiServicioSingleton {

	private String unAtributo;
	
	// Una instancia estatica propia
	private static MiServicioSingleton instance = null;
	
	// Contructor vacio pero privado, para evitar la instanciacion directa
	private MiServicioSingleton() {}
	
	public static MiServicioSingleton getInstance() {
		if(instance == null) {
			instance =  new MiServicioSingleton();
		}
		
		return instance;
	}
	
	public String getUnAtributo() {
		return unAtributo;
	}
	
	public void setUnAtributo(String atributo) {
		this.unAtributo = atributo;
	}
}
