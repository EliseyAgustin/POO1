package colecciones;

import java.util.Objects;

public class Punto implements Comparable<Punto> {

	private double x;
	private double y;

	public Punto(double x, double y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "[" + x + ", " + y + "]";
	}

	public void desplazar(double deltaX, double deltaY) {
		this.x += deltaX;
		this.y += deltaY;
	}

	@Override
	public int hashCode() {
		return Objects.hash(x, y);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Punto other = (Punto) obj;
		return Double.doubleToLongBits(x) == Double.doubleToLongBits(other.x)
				&& Double.doubleToLongBits(y) == Double.doubleToLongBits(other.y);
	}
	@Override
	public int compareTo(Punto o) {
		if(Double.compare(this.distanciaAlOrigen(), o.distanciaAlOrigen()) == 0)
			if(Double.compare(this.x, o.x) == 0)
				return Double.compare(this.y, o.y);
			else
				return Double.compare(this.x, o.x);
		return Double.compare(this.distanciaAlOrigen(), o.distanciaAlOrigen());
	}

	public double distancia(Punto o) {
		return Math.hypot(this.x - o.x, this.y - o.y);
	}

	

	private double distanciaAlOrigen() {
		return this.distancia(new Punto(0,0));
	}

}