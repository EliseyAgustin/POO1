package comparators;

import java.util.ArrayList;
import java.util.Collections;

public class DemoPersona{

	public static void main(String[] args) {

		Persona pepe = new Persona(12345678, "Pepe", 23);
		Persona ana = new Persona(23456789, "Lopez, Ana", 35);
		Persona luis = new Persona(32123432, "Luis", 38);
		Persona laura = new Persona(45673423, "Laura", 29);

		ArrayList<Persona> personas = new ArrayList<Persona>();

		personas.add(pepe);
		personas.add(ana);
		personas.add(luis);
		personas.add(laura);

		listarPersonas(personas);

		if (personas.contains(luis)) {
			int posicion = personas.indexOf(luis);
			System.out.println("luis:" + personas.get(posicion));
		}
		
		//Listar personas ordenedas por DNI
		
		Collections.sort(personas, new ComparadorPorDni());
		listarPersonas(personas);
		
		//Listar personas ordenedas por Apenom
		Collections.sort(personas, new ComparadorPorApenom());
		listarPersonas(personas);
		
		//Listar personas ordenedas por edad
		Collections.sort(personas, Collections.reverseOrder(new ComparadorPorEdad()));
		listarPersonas(personas);
		
		

	}

	private static void listarPersonas(ArrayList<Persona> personas) {
		for (Persona p : personas) {
			System.out.println(p);
		}
		System.out.println("-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.");
	}

}