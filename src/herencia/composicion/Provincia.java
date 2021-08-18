/**
 * 
 */
package herencia.composicion;

import java.util.List;

/**
 * @author Francisco
 *
 */
public class Provincia {
	
	private String nombre;
	private List<Municipio> municipios;
	
	public Provincia(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return this.getNombre();
	}
	
	public List<Municipio> getMunicipios() {
		return this.municipios;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setMunicipios(List<Municipio> municipios) {
		this.municipios = municipios;
	}
}
