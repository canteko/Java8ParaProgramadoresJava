/**
 * 
 */
package encapsulacion;

import java.time.LocalDate;

import encapsulacion.modelo.Persona;
import encapsulacion.servicio.Servicio;
import encapsulacion.utilidad.UtilsDni;

/**
 * @author Francisco
 *
 */
public class MainEncapsulacion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Persona p = new Persona("12345678A", "Pepe", "Perez", LocalDate.of(1980, 1, 1));
		
		Servicio s = new Servicio();
		
		s.addPersona(p);
		
		for (Persona per : s.listarTodasPersonas()) {
			System.out.println(per);
			System.out.println((UtilsDni.verificarLetraDni(p.getDni()) ? "DNI Correcto" : "DNI Incorrecto"));
		}

	}

}
