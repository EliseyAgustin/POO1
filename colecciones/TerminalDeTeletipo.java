package colecciones;

import java.util.Stack;

public class TerminalDeTeletipo {

	public String teletipear(String cadena) {

		Stack<Character> pila = new Stack<Character>();

		for (int i = 0; i < cadena.length(); i++) {
			
			if (cadena.charAt(i) != '/' && cadena.charAt(i) != '&')
				pila.push(cadena.charAt(i));
			if (cadena.charAt(i) == '/' && !pila.isEmpty())
				pila.pop();
			if (cadena.charAt(i) == '&')
				pila.clear();
			
		}

		Stack<Character> otraPila = new Stack<Character>();

		while (!pila.isEmpty()) {
			otraPila.push(pila.pop());
		}

		String aux = "";

		while (!otraPila.isEmpty()) {
			aux += otraPila.pop();
		}

		return aux;

	}

}
