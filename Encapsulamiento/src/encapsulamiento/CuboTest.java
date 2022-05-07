package encapsulamiento;

import static org.junit.Assert.*;

import org.junit.Test;

public class CuboTest {

	Cubo cubito;

	@Test
	public void constructorTest() {
		cubito = new Cubo(5);
		assertNotNull(cubito);

	}

	@Test
	public void medirLadoTest() {
		cubito = new Cubo(5);
		int esperado = 5;
		int obtenido = cubito.medirLongitudLado();
		assertEquals(esperado, obtenido);

	}

	@Test(expected = Error.class)
	public void ladoNegativoTest() {
		Cubo cubitoImposible = new Cubo(-1);
	}

	@Test
	public void medirSuperficieTest() {
		cubito = new Cubo(5);
		int esperado = 25;
		int obtenido = cubito.medirSuperficieCara();
		assertEquals(esperado, obtenido);
	}

	@Test
	public void cambiarSuperficieCaraTest() {
		cubito = new Cubo(5);
		cubito.cambiarSuperficieCara(16);

		int esperado = 16;
		int obtenido = cubito.medirSuperficieCara();
		assertEquals(esperado, obtenido);
	}

	@Test(expected = Error.class)
	public void cambiarSuperficieCaraNegativaTest() {
		cubito = new Cubo(5);
		cubito.cambiarSuperficieCara(-16);

	}

	@Test
	public void medirVolumenTest() {
		cubito = new Cubo(5);
		assertEquals(125, cubito.medirVolumen());
	}

	@Test
	public void cambiarVolumenTest() {
		cubito = new Cubo(5);
		cubito.cambiarVolumen(64);
		assertEquals(4, cubito.medirLongitudLado());
		assertEquals(64, cubito.medirVolumen());
	}

	@Test(expected = Error.class)
	public void cambiarVolumenNegativoTest() {
		cubito = new Cubo(5);
		cubito.cambiarVolumen(-64);
		
	}

}
