package item;

import unidades.Soldado;

public class Capa extends Soldado{
	
	private Soldado unidad;

	public Capa(Soldado unidad) {
		super(unidad);
		this.setUnidad(unidad);
		
		unidad.getEnergia(unidad.getEnergia()*2);
		unidad.infringirDanio(unidad.infringirDanio()*0.9);
	}

	public Soldado getUnidad() {
		return unidad;
	}

	public void setUnidad(Soldado unidad) {
		this.unidad = unidad;
	}
	
	

}
