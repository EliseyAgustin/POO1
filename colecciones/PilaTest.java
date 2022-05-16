package colecciones;

import java.util.Stack;

public class PilaTest {

	public static void main(String[] args) {
		Stack <Integer> pila = new Stack <Integer>();
		
		pila.push(5);
		pila.push(15);
		pila.push(55);
		pila.push(-5);
		pila.push(55);
		pila.push(2);
		
		System.out.println(pila.peek());
		System.out.println(pila.isEmpty());
		System.out.println(pila);
		
		pila.pop();
		pila.pop();
		System.out.println(pila);
	}

}

