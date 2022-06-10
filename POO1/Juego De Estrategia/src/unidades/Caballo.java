package unidades;

public class Caballo implements Bebedor {

	private boolean rebelde = false;
	private int cantAtaques = 0;
	
	@Override
	public void beberAgua() {
		this.setRebelde(false);
		this.setCantAtaques(0);
		
	}
	
	public void incrementarAtaque() {
		this.setCantAtaques(this.getCantAtaques() + 1);
	}

	public boolean isRebelde() {
		return rebelde;
	}

	public void setRebelde(boolean rebelde) {
		this.rebelde = rebelde;
	}

	public int getCantAtaques() {
		return cantAtaques;
	}

	public void setCantAtaques(int cantAtaques) {
		this.cantAtaques = cantAtaques;
	}

}
