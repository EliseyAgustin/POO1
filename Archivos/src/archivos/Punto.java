package archivos;

public class Punto {

	private double x;
	private double y;

	public Punto(double x, double y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "Punto [x=" + x + ", y=" + y + "]";
	}

	public void desplazar(double deltaX, double deltaY) {
		this.x += deltaX;
		this.y += deltaY;
	}

	public double distancia(Punto o) {
		return Math.hypot(this.x - o.x, this.y - o.y);
	}

}