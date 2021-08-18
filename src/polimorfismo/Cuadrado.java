/**
 * 
 */
package polimorfismo;

/**
 * @author Francisco
 *
 */
public class Cuadrado extends Rectangulo {

	/**
	 * @param base
	 * @param altura
	 */
	public Cuadrado(float lado) {
		super(lado, lado);
	}
	
	public float getLado() {
		return this.getAltura();
	}
	
	/**
	 * @return the area
	 */
	public float getArea() {
		return this.getBase() * this.getBase();
	}

	/**
	 * @return the perimetro
	 */
	public float getPerimetro() {
		return this.getLado() * 4;
	}
	
	public void setLado(float lado) {
		this.setAltura(lado);
		this.setBase(lado);
	}
	
}
