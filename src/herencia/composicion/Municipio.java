/**
 * 
 */
package herencia.composicion;

/**
 * @author Francisco
 *
 */
public class Municipio {
	private String nombre;
	private int habitantes;
		
	/**
	 * @param nombre
	 * @param habitantes
	 */
	public Municipio(String nombre, int habitantes) {
		this.nombre = nombre;
		this.habitantes = habitantes;
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @return the habitantes
	 */
	public int getHabitantes() {
		return habitantes;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @param habitantes the habitantes to set
	 */
	public void setHabitantes(int habitantes) {
		this.habitantes = habitantes;
	}
}
