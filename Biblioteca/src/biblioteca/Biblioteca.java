package biblioteca;

public class Biblioteca {
	private Libro[] libros;
	private int cantidadDeLibros = 0;
	private int posicionDelLibroMasPaginudo = 0;

	public Biblioteca(int maxCantidadDeLibros) {
		this.libros = new Libro[maxCantidadDeLibros];
	}

	public int cuantosLibros() {
		return this.cantidadDeLibros;
	}

	public boolean agregar(String titulo, String autor, int cantPaginas) {
		if (this.cantidadDeLibros < getMaximaCantidadDeLibros()) {
			libros[cantidadDeLibros] = new Libro(titulo, autor, cantPaginas);
			setPosicionDelLibroMasPaginudo();
			cantidadDeLibros++;
			return true;
		}
		return false;
	}

	private void setPosicionDelLibroMasPaginudo() {
		if (libros[cantidadDeLibros].getCantPaginas() > libros[posicionDelLibroMasPaginudo].getCantPaginas()) {
			this.posicionDelLibroMasPaginudo = this.cantidadDeLibros;
		}

	}

	private int getMaximaCantidadDeLibros() {
		return this.libros.length;
	}

	public String libroEnLaPosicion(int posicion) {
		if (posicion < 1 || posicion > this.cantidadDeLibros)
			throw new Error("Posición fuera de los límites");

		return libros[posicion - 1].getTitulo();
	}

	public Libro libroConMasPaginas() {
		return libros[posicionDelLibroMasPaginudo];
	}

	public int cuantosLibrosDelAutor(String autor) {
		int contador = 0;
		for (int i = 0; i < this.cantidadDeLibros; i++)
			if (libros[i].getAutor().equals(autor))
				contador++;

		return contador;

	}

	public Libro[] librosDelAutor(String autor) {
		int contLibros = 0;
		int tamanioDelArregloAretornar = this.cuantosLibrosDelAutor(autor);
		Libro librosDelAutor[] = new Libro[tamanioDelArregloAretornar];
		for (int i = 0; i < this.cantidadDeLibros; i++)
			if (libros[i].getAutor().equals(autor)) {
				librosDelAutor[contLibros] = libros[i];
				contLibros++;
			}

		return librosDelAutor;

	}

	public int tiempoEnLeerTodosLosLibros() {
		int contadorDeMinutos = 0;
		for (int i = 0; i < this.cantidadDeLibros; i++) {
			contadorDeMinutos += libros[i].getTiempoEnLeer();
		}

		return contadorDeMinutos;
	}
	
}

	