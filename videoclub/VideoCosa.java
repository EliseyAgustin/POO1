package videoclub;

public abstract class VideoCosa implements Entregable{

	private String titulo;
	private boolean entregado = false;
	private Genero genero;
	
	public VideoCosa(String titulo, Genero genero) {
		setTitulo(titulo);
		setGenero(genero);
	}
	
	@Override
	public void entregar() {
		this.entregado = true;
	}
	
	@Override
	public void devolver() {
		this.entregado = false;
	}
	
	@Override
	public boolean isEntregado() {
		return this.entregado;
	}
	
	protected String getTitulo() {
		return titulo;
	}
	protected void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	protected Genero getGenero() {
		return genero;
	}
	protected void setGenero(Genero genero) {
		this.genero = genero;
	} 
}

