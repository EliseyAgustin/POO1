package encapsulamiento;

public class Punto {

	public double x;
	public double y;
	
	public Punto(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
	
	public boolean estaSobreElEjeX() {
		return (this.y == 0);
	}
	
	public boolean estaSobreElEjeY() {
		return (this.x == 0);
	}
	
	public boolean esElOrigenDeCoordenadas() {
		return estaSobreElEjeX() && estaSobreElEjeY();
	}
}
