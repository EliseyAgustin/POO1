package encapsulamiento;

import static org.junit.Assert.*;

import org.junit.Test;

public class CajaDeAhorroTest {

	CajaDeAhorro ca;
	public void setUp() throws Exception{
		ca = new CajaDeAhorro("Peque");
	}

	@Test
	public void creoCuentaTest() {
		assertNotNull(ca);
	}
	@Test
	public void consultarTitularTest() {
		String esperado = "Peque";
		String obtenido = ca.obtenerTitular();
		assertEquals(esperado, obtenido);
	}
	@Test
	public void consultarSaldoTest() {
		double esperado = 0;
		double obtenido = ca.consultarSaldo();
		assertEquals(esperado,obtenido,0.001);
	}
	@Test
	public void depositarTest() {
		ca.depositar(1000);
		double esperado = 1000;
		double obtenido = ca.consultarSaldo();
		assertEquals(esperado,obtenido,0.001);
	}
	
	@Test(expected = Error.class)
	public void depositarCeroTest() {
		ca.depositar(0);
		double esperado = 0;
		double obtenido = ca.consultarSaldo();
		assertEquals(esperado,obtenido,0.001);
	}
	@Test(expected = Error.class)
	public void depositarNegativoTest() {
		ca.depositar(-10);
	}
	@Test
	public void extraerTest() {
		ca.depositar(1000.50);
		ca.extraer(500);
		double esperado= 500.50;
		double obtenido = ca.consultarSaldo();
		assertEquals(esperado, obtenido, 0.0001);
		assertTrue(ca.extraer(500));

	}
	@Test
	public void extraerDeMasTest() {
		ca.depositar(1000);
		ca.extraer(1500);
		double esperado= 1000;
		double obtenido = ca.consultarSaldo();
		assertEquals(esperado,obtenido,0.0001);
		assertFalse(ca.extraer(1500));

	}

	@Test (expected = Error.class)
	public void extraerNegativoTest() {
		ca.depositar(1000);
		ca.extraer(-5);
		
	}
}

