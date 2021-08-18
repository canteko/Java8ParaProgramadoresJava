/**
 * 
 */
package polimorfismo.interfaz;

/**
 * @author Francisco
 *
 */
public interface Hija extends Base {

	default public void saludar(String saludo) {
		System.out.println(saludo + " desde Hija");
	}
	
}
