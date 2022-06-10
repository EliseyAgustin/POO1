package unidades;

public class Soldado extends Unidades implements Bebedor{

	private int energia;
	private static final int DANIO = 10;

	
	public Soldado(Punto posicion) {
		super(200, posicion);
		this.energia = 100;
	}

	@Override
	public void atacar(Unidades u) {
		
		if (this.puedeAtacar(u)) {
			this.energia -= 10;
			this.infringirDanio(u);
			u.recibirDanio(getDanio());
		}
	}

	public void infringirDanio(Unidades u) {
		u.recibirDanio(DANIO);
	}

	@Override
	public boolean puedeAtacar(Unidades u) {
		return (!u.estaMuerta() && u.distancia(u) == 0 && this.energia >= 10);
	}

	public int getEnergia() {
		return energia;
	}

	@Override
	public void beberAgua() {
		this.energia = 100;
		
	}

	@Override
	public void recibirDanio(double d) {
		
		
	}
	
}