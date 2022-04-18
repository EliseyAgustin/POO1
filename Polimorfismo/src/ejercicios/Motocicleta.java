package ejercicios;

public class Motocicleta extends Vehiculo {

	private Persona acompaniante;
	
	public Motocicleta(int kms, Persona chofer) {
		super(kms, chofer);
		
	}

	public boolean agregarAcompaniante(Persona acompaniante) {
		if(!hayAcompaniante() && hayChofer()) {
			this.acompaniante = acompaniante;
			return true;
		}
		return false;
	}

	@Override
	public boolean cambiarChofer(Persona nuevoChofer) {
		if(!hayAcompaniante()) {
			super.asignarChofer(nuevoChofer); 
			return true;
		}
		return false;
	}

	private boolean hayAcompaniante() {
		return this.acompaniante != null;
		
	}

	@Override
	public String toString() {
		return super.toString() + "  Motocicleta [acompaniante=" + acompaniante;
	}
	
}