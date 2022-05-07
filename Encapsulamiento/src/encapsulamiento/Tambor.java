package encapsulamiento;

public class Tambor {
	private int posicion;
	
	public Tambor() {
		this.posicion = 1;
	}
	
	public void girar() {
		double aleatorio = Math.random();
		posicion = (int) (aleatorio * 8) + 1;
	}
	
	public int getposicion() {
		return this.posicion;
		
	}

}