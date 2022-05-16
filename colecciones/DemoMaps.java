package colecciones;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class DemoMaps {

	/* Escribir una función que reciba una cadena de caracteres 
	 * y muestre por pantalla la frecuencia de aparición de cada letra. 
	 * Por ejemplo:
	 frecuencias("hola como estas"); // debe mostrar por pantalla:
		a: 2
		c: 1
		e: 1
		h: 1
		l: 1
		m: 1
		o: 3
		s: 2
		t: 1
}
*/
	public static Map<Character, Integer> frecuencias(String cadena){
		Map<Character, Integer> mapa = new TreeMap<Character, Integer>();
		Character letra;
		Integer contadorDeLetras;
		
		for(int i=0; i < cadena.length(); i++) {
			letra = cadena.charAt(i);
			if(mapa.containsKey(letra)) {
				contadorDeLetras = mapa.get(letra);
				contadorDeLetras ++;
				mapa.put(letra, contadorDeLetras);
			}
			else { 
				mapa.put(letra, 1);
			}
		}	
					
		return mapa;
	}
	
	public static void main(String[] args) {
		String cadena = "Hola como estas?";
		String cadenaEnMinuscula = cadena.toLowerCase();
		String cadenaSinEspacios = cadenaEnMinuscula.replace(" ", "");
		
		Map<Character, Integer> letraContador = frecuencias(cadenaSinEspacios);
		
		for(Entry<Character, Integer> cadaLetra : letraContador.entrySet()) {
			System.out.println(cadaLetra.getKey() + ": " + cadaLetra.getValue());
		}
		
}
	
	}