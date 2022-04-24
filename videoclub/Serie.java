package videoclub;

public class Serie extends VideoCosa{

	private int temporadas;
	private String creador;
	
	public Serie(String titulo, int temporadas, Genero genero, String creador) {
		super(titulo, genero);
		setTemporadas(temporadas);
		setCreador(creador);
	}
	
	protected int getTemporadas() {
		return temporadas;
	}
	protected void setTemporadas(int temporadas) {
		this.temporadas = temporadas;
	}
	protected String getCreador() {
		return this.creador;
	}
	protected void setCreador(String creador) {
		this.creador = creador;
	}
	
	@Override
	public int compareTo(Entregable otraSerie) {
		Serie aux;
		if(otraSerie instanceof Serie) {
			aux = (Serie)otraSerie;
			return Integer.compare(this.temporadas, aux.temporadas);
		}
		else throw new Error("Error de tipos");
	}
}

