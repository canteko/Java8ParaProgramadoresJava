/**
 * 
 */
package clasegenerica.bounded;

/**
 * @author Francisco
 *
 */
public class EjemploBounded {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		NumericBox<Integer> integerBox = new NumericBox<>(1);
		NumericBox<Float> floatBox = new NumericBox<>(1f);
		// No se puede porque no extiende de number
//		NumericBox<String> stringBox = new NumericBox<>("Shola");

	}

}
