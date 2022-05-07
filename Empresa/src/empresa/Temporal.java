package empresa;

public class Temporal extends Empleado {
	
private static final double VALOR_HORA = 200;
	
	
	public Temporal(boolean estaCasado, int hijos, int horasTrabajadas) {
		super(estaCasado, hijos, horasTrabajadas);
	}

	
	@Override
	public double obtenerSueldo() {
		return super.horasTrabajadas * VALOR_HORA 
				+ super.obtenerSalarioFamiliar();
	}
}