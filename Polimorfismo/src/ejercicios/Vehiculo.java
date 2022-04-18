package ejercicios;

public abstract class Vehiculo {
	private int kilometrosRecorridos;
	private Persona chofer;

	public Vehiculo(int kms, Persona chofer) {
		this.kilometrosRecorridos = kms;
		asignarChofer(chofer);
	}

	public int getKilometrosRecorridos() {
		return this.kilometrosRecorridos;
	}

	protected void asignarChofer(Persona chofer) {
		this.chofer = chofer;
	}
	
	protected boolean hayChofer() {
		return this.chofer !=null;
	}
	
	protected Persona getChofer() {
		return chofer;
	}

	@Override
	public String toString() {
		return "Vehiculo [kilometrosRecorridos=" + kilometrosRecorridos;
	}

	public abstract boolean cambiarChofer(Persona nuevoChofer);

}
