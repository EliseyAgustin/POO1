package comparators;

import java.util.Comparator;

public class ComparadorPorApenom implements Comparator<Persona>{

	@Override
	public int compare(Persona p1, Persona p2) {
		return p1.getApeneom().compareTo(p2.getApeneom());
	}

}
