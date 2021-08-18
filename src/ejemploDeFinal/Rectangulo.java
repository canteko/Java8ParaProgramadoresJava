package ejemploDeFinal;

public class Rectangulo {
	
	private float base;
	private float altura;
	
	/**
	 * @param base
	 * @param altura
	 */
	public Rectangulo(float base, float altura) {
		this.base = base;
		this.altura = altura;
	}

	/**
	 * @return the base
	 */
	public float getBase() {
		return base;
	}

	/**
	 * @return the altura
	 */
	public float getAltura() {
		return altura;
	}

	/**
	 * @return the area
	 */
	final public float getArea() {
		return base * altura;
	}

	/**
	 * @return the perimetro
	 */
	final public float getPerimetro() {
		return altura * 2 + altura * 2;
	}
	
	/**
	 * @param base the base to set
	 */
	public void setBase(float base) {
		this.base = base;
	}

	/**
	 * @param altura the altura to set
	 */
	public void setAltura(float altura) {
		this.altura = altura;
	}	
}
