package collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Comparator;

import collections.modelo.Persona;

public class EjemploList {

	public static void main(String[] args) {
		List<Persona> personas = new ArrayList<>();
//		List<Persona> personas = new LinkedList<>();

		personas.add(new Persona());
		personas.add(new Persona("Rudolf"));
		personas.add(new Persona("Alberto"));
		personas.add(new Persona("Laila"));
		
		System.out.println(personas.get(3));
		
		for(Persona persona : personas) {
			System.out.println(persona);
		}
		
		System.out.println();
		
		personas.set(0, new Persona("Jane"));

		for(Persona persona : personas) {
			System.out.println(persona);
		}
		
		personas.sort(new Comparator<Persona> (){
			@Override
			public int compare(Persona p1, Persona p2) {
				return p1.getNombre().compareToIgnoreCase(p2.getNombre());
			}
		});
		
		personas.add(new Persona());
		personas.add(new Persona("Rudolf"));
		personas.add(new Persona("Alberto"));
		personas.add(new Persona("Laila"));
		
		Collections.sort(personas);
		int position = Collections.binarySearch(personas, new Persona());

		System.out.println(position);

		for(Persona persona : personas) {
			System.out.println(persona);
		}
	}

}
