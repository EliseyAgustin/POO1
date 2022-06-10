package unidades;

public class Lancero extends Unidades{
	
	private static final int Danio = 25;
	private int salud = 150;

	
	public Lancero(Punto posicion) {
		super(150, posicion);
	}

	@Override
	public void atacar(Unidades u) {
		if (this.puedeAtacar(u)) {
			this.salud -= Danio;
			this.infringirDanio(u);
		}
	}

	public void infringirDanio(Unidades u) {
		u.recibirDanio(Danio);
	}

	@Override
	public boolean puedeAtacar(Unidades u) {
		return (!u.estaMuerta() && u.distancia(u) >= 1 && u.distancia(u) <= 3 && this.salud > 0);
	}

	@Override
	public void recibirDanio(double d) {
		// TODO Auto-generated method stub
		
	}

}


