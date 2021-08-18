package singleton;

public class UsoSingleton {

	public static void main(String[] args) {
//		MiServicioSingleton service = new MiServicioSingleton(); // Esto peta
		MiServicioSingleton service1 = MiServicioSingleton.getInstance();
		MiServicioSingleton service2 = MiServicioSingleton.getInstance();
		MiServicioSingleton service3 = MiServicioSingleton.getInstance();

		System.out.println(service1);
		System.out.println(service2);
		System.out.println(service3);
		
		service1.setUnAtributo("SOY EL MISMO");
		
		System.out.println(service3.getUnAtributo());
	}
	
}
