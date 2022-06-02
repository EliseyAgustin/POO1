package figuras;

public class Rectangulo extends Figura {//EL EXTENDS SE ULIZA PARA HEREDAR DE OTRA CLASE
	
	// ATRIBUTOS
	private double base;
	private double altura;
	
	// CONSTRUCTOR
	public Rectangulo(String color, double base, double altura) {
		super(color);
		this.base = base;
		this.altura = altura;
	}
	
	// GETTERS
	public double getPerimetro() {
		return (2 * (this.base + this.altura));
	}
	
	public double getArea() {
		return (this.base * this.altura);
	}
	
	@Override
	public String queSoy() {
		return ("Soy un Rectangulo");
	}
	
	// PROTECTED -> VISIBLE PARA TODAS LAS CLASES DEL MISMO PAQUETE
	protected double getBase() {
		return base;
	}
	
	protected double getAltura() {
		return altura;
	}
}