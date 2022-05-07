package empresa;

public class Permanente extends Empleado {

	private static final double VALOR_ANIO_ANTIGUEDAD = 100;
	private static final double VALOR_HORA = 300;
	protected int antiguedad;
	
	public Permanente(boolean estaCasado, int hijos, int horasTrabajadas, int antiguedad) {
		super(estaCasado, hijos, horasTrabajadas);
		this.antiguedad = antiguedad;
	}

	
	@Override
	public double obtenerSueldo() {
		return super.horasTrabajadas * Permanente.VALOR_HORA 
				+ this.antiguedad * Permanente.VALOR_ANIO_ANTIGUEDAD 
				+ super.obtenerSalarioFamiliar();
	}
}