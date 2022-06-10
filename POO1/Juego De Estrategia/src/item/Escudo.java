package item;

import unidades.Unidades;

public class Escudo extends Item {

	public Escudo(Unidades unidad) {
		super(unidad);
		this.unidad = unidad;
	}

	@Override
	public void atacar(Unidades u) {
		this.unidad.atacar(u);
	}

	@Override
	public boolean puedeAtacar(Unidades u) {
		if (!u.estaMuerta())
			return true;
		
		return false;
	}
	
	@Override
	public void recibirDanio(double danio) {
		this.unidad.recibirDanio(danio * 0.4);
	}

}