package unidades;

import item.Item;

public abstract class Unidades {
	
	protected int salud;
	protected Punto posicion;
	protected int danio;
	protected Item escudo;

	public Unidades(int salud, Punto posicion) {
		this.salud = salud;
	}
	
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
	
	public int getSalud() {
		return salud;
	}

	public int getFlechas(int flechas) {
		return flechas;
	}

	public Punto getPosicion() {
		return this.posicion;
		
	}
    
	public int getDanio() {
		return danio;
	}
	
	public int setDanio(int i) {
		return danio;
	}

	public abstract void recibirDanio(double d);

}