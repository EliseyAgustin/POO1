package colecciones;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Stock {

	public static Map<Integer, Integer> agruparStock(List<Producto> listaProd) {
		Map<Integer, Integer> stockFinal = new TreeMap<Integer, Integer>();
		Integer key;
		Integer value;
		for (Producto cadaProd : listaProd) {
			key = cadaProd.getCodProducto();
			if (stockFinal.containsKey(key)) {
				value = stockFinal.get(key);
				value += cadaProd.getStocProducto();
				stockFinal.put(key, value += cadaProd.getStocProducto());
			} else {
				stockFinal.put(key, cadaProd.getStocProducto());
			}
		}
		return stockFinal;
	}

	public static void main(String[] args) {
		List<Producto> listaProd = new ArrayList<Producto>();
		listaProd.add(new Producto(1, 50));
		listaProd.add(new Producto(3, 25));
		listaProd.add(new Producto(1, 30));
		listaProd.add(new Producto(2, 12));
		listaProd.add(new Producto(1, 43));
		listaProd.add(new Producto(3, 80));

		Map<Integer, Integer> stock = agruparStock(listaProd);

		for (Map.Entry<Integer, Integer> cadaProducto : stock.entrySet()) {
			System.out.println(cadaProducto.getKey() + ": " + cadaProducto.getValue());
		}
	}

}

