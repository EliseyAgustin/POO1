package videoclub;

public class Pelicula extends VideoCosa{

	private int anio;
	private String director;
	
	public Pelicula(String titulo, int anio, Genero genero, String director) {
		
		super(titulo,genero);
		setAnio(anio);
		setDirector(director);
	}
	
	public Pelicula(String titulo,String director) {
		this(titulo, 0, Genero.NO_DEFINIDO,director);
	}
	public Pelicula(String titulo) {
		this(titulo, 0, Genero.NO_DEFINIDO, "");
	}
	public Pelicula() {
		this("");
	}
	@Override
	public String toString() {
		return "Pelicula [titulo=" +super.getTitulo()+
				", año ="+anio+",entregado= "+super.isEntregado()+
				",genero= "+super.getGenero()+
				",director= "+director+"]";
	}
	protected int getAnio() {
		return anio;
	}
	protected void setAnio(int anio) {
		this.anio = anio;
	}
	protected void setDirector(String director) {
		this.director = director;
	}
	
	@Override
	public int compareTo(Entregable otraPeli) {
		Pelicula aux;
		if(otraPeli instanceof Pelicula) {
			aux=(Pelicula) otraPeli;
			return Integer.compare(this.anio, aux.anio);
		}
		else throw new Error("Error de tipos");
	}
	
}
