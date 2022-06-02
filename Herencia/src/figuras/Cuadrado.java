package figuras;

public class Cuadrado extends Rectangulo {
	
	// CONSTRUCTOR PARAMETRIZADO
	public Cuadrado(String color, double lado) {
		super(color, lado, lado);
	}
	
	// METODOS
	@Override
	public String queSoy() {
		return "Soy un Cuadrado";
	}
	
	// GET
	public double getLado() {
		return this.getBase();
	}
	
}
