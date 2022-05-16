package colecciones;

public class Producto implements Comparable <Producto> {

	private int codProducto;
	private int stocProducto;
	
	public Producto(int codProducto, int stocProducto) {
		this.codProducto = codProducto;
		this.stocProducto = stocProducto;
	}

	public int getCodProducto() {
		return codProducto;
	}

	public int getStocProducto() {
		return stocProducto;
	}

	@Override
	public int compareTo(Producto o) {
		return Integer.compare(this.codProducto, o.codProducto);
	}
	
	
	
	

}
