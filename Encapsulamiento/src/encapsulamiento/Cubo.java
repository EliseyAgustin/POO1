package encapsulamiento;

public class Cubo {
	
	public static void main(String args[]) {
		
		
	}

	private int lado;

	public Cubo(int lado) {
		setLado(lado);
	}

	public int medirLongitudLado() {
		return this.lado;
	}
	
	public void cambiarLongitudLado(int lado) {
		setLado(lado);
		
	}

	private void setLado(int lado) {
		if(lado <= 0)
			throw new Error("No se pueden usar valores negativos");
		this.lado = lado;
	}
	
	public int medirSuperficieCara() {
		return this.lado * this.lado;
	}
	
	public void cambiarSuperficieCara(int superficieCara) {
		if(superficieCara <= 0)
			throw new Error("La superficie no debe ser negativa ni cero");
		this.lado = (int)Math.sqrt(superficieCara);
		
	}
	
	public int medirVolumen() {
		return this.lado * this.lado * this.lado;
		
	}
	
	public void cambiarVolumen(int volumen) {
		if (volumen <= 0)
			throw new Error("No se admiten volumnenes negativos o cero");
		this.lado = (int)Math.cbrt(volumen);
		
	}
}
