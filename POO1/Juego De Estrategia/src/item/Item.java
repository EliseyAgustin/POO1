package item;

import unidades.Unidades;

public abstract class Item extends Unidades {
	
	protected Unidades unidad;
	
	public Item(Unidades unidad) {
		super(unidad.getSalud(), unidad.getPosicion());
		this.unidad = unidad;
	}

	public int Energia() {
		return 0;
	}

	public void recibirDanio(double danio) {
		
		
	}

}