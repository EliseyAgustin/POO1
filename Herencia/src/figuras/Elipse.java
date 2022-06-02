package figuras;

public class Elipse extends Figura {

	// ATRIBUTOS
	private double radioGrande;
	private double radioChico;

	// CONSTRUCTOR
	public Elipse(String color, double radioGrande, double radioChico) {
		super(color);
		this.radioChico = radioChico;
		this.radioGrande = radioGrande;
	}

	// GETTERS - SOBREESCRITURA
	public double getPerimetro() {
		return (Math.PI * (this.radioChico + this.radioGrande));
	}

	public double getArea() {
		return (Math.PI * this.radioChico * this.radioGrande);
	}

	@Override
	public String queSoy() {
		return "Soy un Elipse";
	}

	// PROTECTED -> VISIBLE PARA TODAS LAS CLASES DEL MISMO PAQUETE
	protected double getRadioChico() {
		return radioChico;
	}

	protected double getRadioGrande() {
		return radioGrande;
	}
}
