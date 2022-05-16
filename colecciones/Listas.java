package colecciones;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Stack;

public class Listas {

	/*
	 * Escribir un método que reciba dos listas de números enteros ordenados y
	 * devuelva una tercera lista de números enteros, con todos los elementos de las
	 * listas que recibió, manteniendo el orden. Por ejemplo si recibe las listas
	 * [1,3,5,6,8,9,10] y [2,4,7], debe devolver [1,2,3,4,5,6,7,8,9,10].
	 */
	public List<Integer> intercalarListas(List<Integer> a, List<Integer> b) {
		List<Integer> aux = new ArrayList<Integer>();

		for (Integer ca : a) {
			aux.add(ca);
		}
		for (Integer cb : b) {
			aux.add(cb);
		}

		Collections.sort(aux);

		return aux;
	}

	/*
	 * Escribe el método eliminarDuplicados, que recibe una lista de enteros y
	 * devuelve una nueva lista con los mismos elementos pero eliminando los
	 * repetidos. Por ejemplo, si la lista de entrada es: [1, 2, 2, 1, 4, 2, 4, 3],
	 * la salida sería: [1, 2, 4, 3].
	 */
	public static List<Integer> eliminarRepetidos(List<Integer> l) {
		List<Integer> aux = new ArrayList<Integer>();
		for (Integer cadaUno : l) {
			if (!aux.contains(cadaUno))
				aux.add(cadaUno);
		}
		return aux;
	}
	
	public static List<Integer> eliminarRepetidosSet(List<Integer> l) {
		List<Integer> aux = new ArrayList<Integer>();
		Set<Integer> setAux = new HashSet<Integer>();
		
		for (Integer cadaUno : l) {
			setAux.add(cadaUno);
		}
		
		for(Integer cs : setAux)
			aux.add(cs);
			
		return aux;
	}


	/*
	 * Escriba un método que reciba una lista de enteros y la devuelva invertida.
	 * Por ejemplo si recibe la lista [1, 2, 3, 4, 5] 
	 * devolverá la lista [5, 4, 3, 2, 1].
	 */
	public static List<Integer> invertirLista(List<Integer> lista) {
		List<Integer> aux = new ArrayList<Integer>();
		Stack<Integer> pila = new Stack<Integer>();
				
		for(Integer cadaUno : lista) {
			pila.push(cadaUno);	
		}
		
		while(!pila.isEmpty()) {
			aux.add(pila.pop());
		}
		return aux;
	}

	/*
	 * Escriba un método que reciba una lista de enteros y devuelva true 
	 * si la lista contiene dos elementos tales que el número 
	 * resultante de sumarlos también sea un elemento de la lista.
	 */
	public static boolean contieneDosSumados(List<Integer> lista) {
		for(int i = 0; i < lista.size()-1; i++) {
			for(int j = i+1; j < lista.size(); j++) {
				if(lista.contains(lista.get(i) + lista.get(j))) { 
					return true;
				}
			}
		}
		return false;
	}
	
	//Tarea para el hogar
	/*
	 * Escriba un método que devuelva true si una lista de enteros es sublista de
	 * otra. Por ejemplo: si tenemos las listas L1 = [22, 14, 6] y 
	 * L2 = [39, 41, 17, 22, 14, 6, 3, 11, 73, 81] 
	 * entonces el método devolverá true porque L1 es una sublista de L2. 
	 * Pero si tenemos otra lista L3 = [39, 41, 22, 17, 14, 3, 11,73, 6, 81], 
	 * vemos que L1 no es sublista de L3 por lo que el método llamado
	 * con L1 y L3 debe devolver false.
	 * 
	 */
	
	

	public static void main(String[] args) {
		LinkedList<Integer> a = new LinkedList<Integer>();
		ArrayList<Integer> b = new ArrayList<Integer>();
		// [1,3,5,6,8,9,10] y [2,4,7]
		a.add(1);
		a.add(3);
		a.add(5);
		a.add(6);
		a.add(8);
		a.add(9);
		a.add(10);
		b.add(2);
		b.add(4);
		b.add(7);

		System.out.println(a);
		System.out.println("------------------------------");
		System.out.println(b);
		System.out.println("------------------------------");

		Listas il = new Listas();
		System.out.println(il.intercalarListas(a, b));

		Integer[] v = { 1, 2, 2, 1, 4, 2, 4, 3 };

		List<Integer> conRepetidos = new LinkedList<Integer>();
		conRepetidos.addAll(Arrays.asList(v));

		System.out.println("Con Repetidos " + conRepetidos);
		System.out.println("Sin Repetidos " + eliminarRepetidos(conRepetidos));

		System.out.println(invertirLista(eliminarRepetidos(conRepetidos)));
		
		List<Integer> sumados = new LinkedList<Integer>();
		sumados.add(1);
		sumados.add(3);
		sumados.add(5);
		sumados.add(7);
		sumados.add(9);
		sumados.add(17);
		
		System.out.println(contieneDosSumados(sumados));
		
		
		
	}

}