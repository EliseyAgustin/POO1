package ejercicios;

public class Autobus extends Vehiculo {

	private Persona[] pasajeros;
	private int asientoVacio = 0;

	public Autobus(int kms, Persona chofer, int cantAsientos) {
		super(kms, chofer);
		this.pasajeros = new Persona[cantAsientos];

	}

	public void subirPasajero(Persona pasajero) {
		if (this.asientoVacio < this.pasajeros.length) {
			this.pasajeros[asientoVacio] = pasajero;
			this.asientoVacio++;
		}
	}

	public void bajarPasajero() {
		if (hayPasajeros())
			this.asientoVacio--;
	}

	@Override
	public boolean cambiarChofer(Persona nuevoChofer) {
		if (!hayPasajeros()) {
			super.asignarChofer(nuevoChofer);
			return true;
		}
		return false;

	}

	private boolean hayPasajeros() {
		return this.asientoVacio > 0;
	}

	@Override
	public String toString() {
		return super.toString() + "  Autobus" +  ", asientoVacio=" + asientoVacio;
	}
	
	

}