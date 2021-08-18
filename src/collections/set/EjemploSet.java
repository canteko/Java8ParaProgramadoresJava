package collections.set;

import java.util.Set;
import java.util.Comparator;
import java.util.HashSet;

import collections.modelo.Persona;

public class EjemploSet {

	public static void main(String[] args) {
		Set<Persona> personas = new HashSet<>();
//		Set<Persona> personas = new TreeSet<>();
//		Set<Persona> personas = new LinkedHashSet<>();

		personas.add(new Persona());
		personas.add(new Persona("Rudolf"));
		personas.add(new Persona("Alberto"));
		personas.add(new Persona("Laila"));
		
		for(Persona persona : personas) {
			System.out.println(persona);
		}
		
		System.out.println();
		
		personas.add(new Persona("Jane"));
		personas.add(new Persona("Jane"));

		for(Persona persona : personas) {
			System.out.println(persona);
		}
	}

}
