package herencia;

public class ClaseBase {
	
	private String mensaje;
	protected String mensaje2;
	
	public ClaseBase() {
		this.mensaje = "Mensaje por defecto";
		this.mensaje2 = "Mensaje por defecto";
	}
	
	public ClaseBase(String mensaje) {
		this.mensaje = mensaje;
		this.mensaje2 = mensaje;
	}

	public void imprimir() {
		System.out.println(this.mensaje);
		System.out.println(this.mensaje2);
	}
	
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	
}
