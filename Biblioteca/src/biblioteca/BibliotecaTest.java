package biblioteca;

import static org.junit.Assert.*;

import org.junit.Test;

public class BibliotecaTest {

	@Test
	public void SinLibrosTest() {
		Biblioteca bibi = new Biblioteca(100);
		assertEquals(0, bibi.cuantosLibros());

	}

	@Test
	public void agregarLibroTest() {
		Biblioteca bibi = new Biblioteca(100);
		assertEquals(0, bibi.cuantosLibros());
		bibi.agregar("Soy Java", "Pepe Java", 1200);
		assertEquals(1, bibi.cuantosLibros());

	}

	@Test
	public void noHayLugarTest() {
		Biblioteca bibi = new Biblioteca(1);
		assertEquals(0, bibi.cuantosLibros());
		bibi.agregar("Soy Java", "Pepe Java", 1200);
		assertFalse(bibi.agregar("Otro Libro", "Autor", 2400));
		Libro esperado = new Libro("Soy Java", "Pepe Java", 1200);
		assertEquals(esperado.getTitulo(), bibi.libroEnLaPosicion((int) 1F));

	}

	@Test
	public void consultarLibroEnLaPrimeraPosicionTest() {
		Biblioteca bibi = new Biblioteca(100);
		assertEquals(0, bibi.cuantosLibros());
		bibi.agregar("Soy Java", "Pepe Java", 1200);
		assertEquals("Soy Java", bibi.libroEnLaPosicion(1));
	}

	@Test(expected = Error.class)
	public void consultarLibroEnPosicionCeroTest() {
		Biblioteca bibi = new Biblioteca(100);
		assertEquals(0, bibi.cuantosLibros());
		bibi.agregar("Soy Java", "Pepe Java", 1200);
		assertEquals("Soy Java", bibi.libroEnLaPosicion(0));
	}

	@Test
	public void consultarLibroEnUltimaPosicionTest() {
		Biblioteca bibi = new Biblioteca(2);
		assertEquals(0, bibi.cuantosLibros());
		bibi.agregar("Soy Java", "Pepe Java", 1200);
		bibi.agregar("El Diego", "Maradona", 500);
		assertEquals("El Diego", bibi.libroEnLaPosicion(2));
	}

	@Test(expected = Error.class)
	public void consultarLibroEnPosicionVaciaTest() {
		Biblioteca bibi = new Biblioteca(4);
		assertEquals(0, bibi.cuantosLibros());
		bibi.agregar("Soy Java", "Pepe Java", 1200);
		bibi.agregar("El Diego", "Maradona", 500);
		assertNull(bibi.libroEnLaPosicion(3));
	}

	@Test
	public void consultarLibroConMasPaginasTest() {
		Biblioteca bibi = new Biblioteca(4);
		assertEquals(0, bibi.cuantosLibros());
		bibi.agregar("Soy Java", "Pepe Java", 1200);
		bibi.agregar("El Diego", "Maradona", 500);
		bibi.agregar("Moby Dick", "Melville", 2500);
		bibi.agregar("Otro Libro", "Autor", 2400);
		Libro esperado = new Libro("Moby Dick", "Melville", 2500);
		assertEquals(esperado, bibi.libroConMasPaginas());
	}

	@Test
	public void consultarLibrosDelAutorTest() {
		Biblioteca bibi = new Biblioteca(100);
		assertEquals(0, bibi.cuantosLibros());
		bibi.agregar("Soy Java", "Pepe Java", 1200);
		bibi.agregar("El Diego", "Maradona", 500);
		bibi.agregar("Moby Dick", "Melville", 2500);
		bibi.agregar("Otro Libro", "Autor", 2400);
		bibi.agregar("Soy C#", "Pepe Java", 1200);
		assertEquals(2, bibi.cuantosLibrosDelAutor("Pepe Java"));
	}

	@Test
	public void LibrosDelAutorTest() {
		Biblioteca bibi = new Biblioteca(100);
		assertEquals(0, bibi.cuantosLibros());
		bibi.agregar("Soy Java", "Pepe Java", 1200);
		bibi.agregar("El Diego", "Maradona", 500);
		bibi.agregar("Moby Dick", "Melville", 2500);
		bibi.agregar("Otro Libro", "Autor", 2400);
		bibi.agregar("Soy C#", "Pepe Java", 1200);
		Libro[] esperado = { new Libro("Soy Java", "Pepe Java", 1200), new Libro("Soy C#", "Pepe Java", 1200) };

		assertArrayEquals(esperado, bibi.librosDelAutor("Pepe Java"));
	}

	@Test
	public void tiempoEnLeerTodoTest() {
		Biblioteca bibi = new Biblioteca(100);
		assertEquals(0, bibi.cuantosLibros());
		bibi.agregar("Soy Java", "Pepe Java", 1200);
		bibi.agregar("El Diego", "Maradona", 500);
		bibi.agregar("Moby Dick", "Melville", 2500);
		bibi.agregar("Otro Libro", "Autor", 2400);
		bibi.agregar("Soy C#", "Pepe Java", 1200);
		assertEquals((1200 + 500 + 2500 + 2400 + 1200), bibi.tiempoEnLeerTodosLosLibros());
	}

}