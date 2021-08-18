package equals;

public class Coche {
	
	private String marca;
	private String modelo;
	private String motorizacion;
	
	/**
	 * @param marca
	 * @param modelo
	 * @param motorizacion
	 */
	public Coche(String marca, String modelo, String motorizacion) {
		this.marca = marca;
		this.modelo = modelo;
		this.motorizacion = motorizacion;
	}
	/**
	 * @return the marca
	 */
	public String getMarca() {
		return marca;
	}
	/**
	 * @return the modelo
	 */
	public String getModelo() {
		return modelo;
	}
	/**
	 * @return the motorizacion
	 */
	public String getMotorizacion() {
		return motorizacion;
	}
	/**
	 * @param marca the marca to set
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}
	/**
	 * @param modelo the modelo to set
	 */
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	/**
	 * @param motorizacion the motorizacion to set
	 */
	public void setMotorizacion(String motorizacion) {
		this.motorizacion = motorizacion;
	}
	
	
}
