package biblioteca;

import java.util.Objects;

public class Libro {

	private String titulo;
	private String autor;
	private int cantPaginas;

	public Libro(String titulo, String autor, int cantPaginas) {
		this.titulo = titulo;
		this.autor = autor;
		this.cantPaginas = cantPaginas;

	}

	public String getTitulo() {
		return titulo;
	}

	public int getCantPaginas() {
		return cantPaginas;
	}

	@Override
	public int hashCode() {
		return Objects.hash(autor, cantPaginas, titulo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro other = (Libro) obj;
		return Objects.equals(autor, other.autor) && cantPaginas == other.cantPaginas
				&& Objects.equals(titulo, other.titulo);
	}

	public String getAutor() {
		return autor;
	}

	public int getTiempoEnLeer() {
		return this.getCantPaginas();
	}
	
	

}