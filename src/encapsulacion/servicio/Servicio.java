package encapsulacion.servicio;

import java.util.List;
import java.util.ArrayList;

import encapsulacion.modelo.Persona;

public class Servicio {

	private List<Persona> lista;
	
	public Servicio() {
		lista = new ArrayList<>();
	}
	
	public void addPersona(Persona p) {
		lista.add(p);
	}
	
	public void editarPersona(Persona p) {
		for(int i = 0; i < lista.size(); i++) {
			if(lista.get(i).getDni().equalsIgnoreCase(p.getDni())) {
				lista.set(i, p);
				break;
			}
		}
	}
	
	public void eliminarPersona(String dni) {
		for(int i = 0; i < lista.size(); i++) {
			if(lista.get(i).getDni().equalsIgnoreCase(dni)) {
				lista.remove(i);
				break;
			}
		}
	}
	
	public List<Persona> listarTodasPersonas() {
		return lista;
	}
}
