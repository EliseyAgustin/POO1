package unidades;

public class Arquero extends Unidades {
	
	private static final int Danio = 5;
	private int flechas = 20;
	private int salud = 50;

	
	public Arquero(Punto posicion) {
		super();
	}

	@Override
	public void atacar(Unidades u) {
		if (this.puedeAtacar(u)) {
			this.salud -= Danio;
			this.infringirDanio(u);
			this.flechas--;
		}
	}

	public void infringirDanio(Unidades u) {
		u.recibirDanio(Danio);
	}

	@Override
	public boolean puedeAtacar(Unidades u) {
		return (!u.estaMuerta() && u.distancia(u) >= 2 && u.distancia(u) <= 5 && this.flechas > 0 && this.salud > 0);
	}
	
	public void recibirFlechas(){
		this.flechas += 6;
	}

}
