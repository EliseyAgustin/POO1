package figuras;

public class Circulo extends Elipse {
	
	// CONSTRUCTOR
	public Circulo(String color, double radio) {
		super(color, radio, radio);
	}
	
	// SOBREESCRITURA
	@Override
	public String queSoy() {
		return "Soy un Circulo";
	}
	
	// GET
	public double getLado() {
		return this.getRadioGrande();
	}
}
