package unidades;

public class Arquero extends Unidades {
	
	private static final int Danio = 5;
	private int flechas = 20;

	
	public Arquero(Punto posicion) {
		super(50, posicion);
	}

	@Override
	public void atacar(Unidades u) {
		if (this.puedeAtacar(u)) {
			this.infringirDanio(u);
			this.flechas--;
		}
	}

	public void infringirDanio(Unidades u) {
		u.recibirDanio(Danio);
	}

	@Override
	public boolean puedeAtacar(Unidades u) {
		return (!u.estaMuerta() && u.distancia(u) >= 2 && u.distancia(u) <= 5 && this.flechas > 0);
	}
	
	public void recibirFlechas(){
		this.flechas += 6;
	}

	@Override
	public void recibirDanio(double d) {
		// TODO Auto-generated method stub
		
	}

}
