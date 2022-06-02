package comparators;

import java.util.Comparator;

public class ComparadorPorDni implements Comparator<Persona> {

	@Override
	public int compare(Persona p1, Persona p2) {
		return Integer.compare(p1.getDni(), p2.getDni());
	}

}
