package encapsulamiento;

public class Disco {
	private double radioInterior;
	private double radioExterior;
	
	
	public Disco(double radioInterior, double radioExterior) {
		if(radioInterior>radioExterior) throw new Error ("No No"); 
			this.radioInterior = radioInterior;
			this.radioExterior = radioExterior;
		
}
	
	public double radioInt() {
		return radioInterior;
	}
	
	public double radioExt() {
		return radioExterior;
	}
	
	double perimetroInterior() {
		return (2 * Math.PI) * radioInterior;
	}
	
	double perimetroExterior() {
		return (2 * Math.PI) * radioExterior;
	}
	
	public double superficieDisco() {
		return Math.PI * (Math.pow(radioInterior, radioExterior));
	}
	
	
public static void main(String[] args) {
		Disco disc = new Disco(4.8, 4.2);
		
		System.out.println("El radio interior es: "+disc.radioInterior);
		System.out.println("El radio exterior es: "+disc.radioExterior);
		System.out.println("El perimetro interior es: "+disc.perimetroInterior());
		System.out.println("El perimetro exterior es: "+disc.radioExterior);
		System.out.println("La superficie del disco es: "+disc.superficieDisco());
	}

}

