package herencia;

public class ClaseDerivada extends ClaseBase {

	public ClaseDerivada() {
		this.setMensaje("Desde la clase derivada");
//		this.mensaje = "asasd";
		this.mensaje2 = "asasd";
	}
	
	public ClaseDerivada(String mensaje) {
		super(mensaje);
	}
	
	public void imprimir() {
		super.imprimir();
		System.out.println("Imprimo desde la clase derivada");
	}
}
