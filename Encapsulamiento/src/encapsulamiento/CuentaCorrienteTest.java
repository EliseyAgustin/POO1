package encapsulamiento;

import static org.junit.Assert.*;

import org.junit.Test;

public class CuentaCorrienteTest {

	@Test
	public void depositarTest() {
		CuentaCorriente cc = new CuentaCorriente("Leo", 20000);
		assertEquals(0, cc.getSaldo(), 0);
		cc.depositar(1000);
		assertEquals(1000, cc.getSaldo(), 0);
		assertEquals("Leo", cc.getTitular());
		assertEquals(20000, cc.getDescubierto(), 0);

	}

	@Test
	public void extraerSaldoSuficienteTest() {
		CuentaCorriente cc = new CuentaCorriente("Leo", 20000);
		assertEquals(0, cc.getSaldo(), 0);
		cc.depositar(10000);
		cc.extraer(9000);
		assertEquals(1000, cc.getSaldo(), 0);

	}

	@Test
	public void extraerSaldoJustoSinDescTest() {
		CuentaCorriente cc = new CuentaCorriente("Leo", 20000);
		assertEquals(0, cc.getSaldo(), 0);
		cc.depositar(10000);
		cc.extraer(10000);
		assertEquals(0, cc.getSaldo(), 0);

	}

	@Test
	public void extraerSaldoJustoConDescTest() {
		CuentaCorriente cc = new CuentaCorriente("Leo", 20000);
		assertEquals(0, cc.getSaldo(), 0);
		cc.depositar(10000);
		cc.extraer(20000);
		assertEquals(-10000, cc.getSaldo(), 0);

	}

	@Test
	public void extraerSaldoJustoConDescJustoTest() {
		CuentaCorriente cc = new CuentaCorriente("Leo", 20000);
		assertEquals(0, cc.getSaldo(), 0);
		cc.depositar(10000);
		cc.extraer(30000);
		assertEquals(-20000, cc.getSaldo(), 0);

	}

	@Test
	public void extraerMasDelSaldoConDescubiertoTest() {
		CuentaCorriente cc = new CuentaCorriente("Leo", 20000);
		assertEquals(0, cc.getSaldo(), 0);
		cc.depositar(10000);
		cc.extraer(30000.50);
		assertEquals(10000, cc.getSaldo(), 0);

	}

}