package collections.map;

import java.util.Map;
import java.util.Comparator;
import java.util.HashMap;

import collections.modelo.Persona;

public class EjemploMap {

	public static void main(String[] args) {
		Map<String, Persona> personas = new HashMap<>();
//		Map<Persona> personas = new TreeMap<>();
//		Map<Persona> personas = new LinkedHashMap<>();

		personas.put("1", new Persona());
		personas.put("2", new Persona("Rudolf"));
		personas.put("3", new Persona("Alberto"));
		personas.put("4", new Persona("Laila"));
		
		System.out.println(personas.get("3"));
		
		for(String persona : personas.keySet()) {
			System.out.println(personas.get(persona));
		}
		
		System.out.println();
		
		personas.put("1", new Persona("Jane"));

		for(String persona : personas.keySet()) {
			System.out.println(personas.get(persona));
		}
	}

}
