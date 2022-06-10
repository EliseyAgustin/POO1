package item;

import unidades.Unidades;

public class Punial extends Item{

	public Punial(Unidades unidad) {
		super(unidad);
		unidad.setDanio(getDanio()+3);
	}

	@Override
	public void recibirDanio(double danio) {
		unidad.recibirDanio((danio + 3));
	}

	@Override
	public void atacar(Unidades u) {
		
	}

	@Override
	public boolean puedeAtacar(Unidades u) {
		return false;
	}


}
