package empresa;

public class Gerente extends Permanente {

	private static final double VALOR_ANIO_ANTIGUEDAD = 150;
	private static final double VALOR_HORA = 400;
	
	public Gerente(boolean estaCasado, int hijos, int horasTrabajadas, int antiguedad) {
		super(estaCasado, hijos, horasTrabajadas, antiguedad);
		
	}
	
	@Override
	public double obtenerSueldo() {
		return super.horasTrabajadas * Gerente.VALOR_HORA 
				+ super.antiguedad * Gerente.VALOR_ANIO_ANTIGUEDAD 
				+ super.obtenerSalarioFamiliar();
	}
	
	
	
}