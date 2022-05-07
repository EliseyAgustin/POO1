package empresa;

public abstract class Empleado {
	private boolean estaCasado;
	private int hijos;
	protected int horasTrabajadas;
	
	public Empleado(boolean estaCasado, int hijos, int horasTrabajadas) {
		this.estaCasado = estaCasado;
		this.hijos = hijos;
		this.horasTrabajadas = horasTrabajadas;
	}
	
	public double obtenerSalarioFamiliar() {
		double sf = this.hijos * 200;  
		if(this.estaCasado)
			sf += 100;
		return sf;		
	}
	
	public abstract double obtenerSueldo();
	
}