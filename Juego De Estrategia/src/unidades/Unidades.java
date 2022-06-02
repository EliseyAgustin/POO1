package unidades;

public abstract class Unidades {
	
	private int salud;
	private Punto posicion;

	public abstract void atacar(Unidades u);
	
	public abstract boolean puedeAtacar(Unidades u);
	
	public boolean estaMuerta() {
		return this.salud == 0;
	}
	
	public double distancia(Unidades u) {
		return this.posicion.distancia(u.posicion);
	}
	
	public void recibirDanio(int danio) {
		this.salud -= danio;
	}
	

	public void Unidad(int salud, Punto posicion) {
		this.salud = salud;
		this.posicion = posicion;
		
	}

	public int getSalud() {
		return salud;
	}

	public int getFlechas(int flechas) {
		
		return flechas;
	}

	
	
	
	

}