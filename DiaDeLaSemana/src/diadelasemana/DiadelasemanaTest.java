package diadelasemana;

import static org.junit.Assert.*;

import org.junit.Test;

public class DiadelasemanaTest {

	@Test
	public void lunesTest() {
		Diadelasemana ddls = new Diadelasemana();
		String esperado = "Lunes";
		String obtenido = ddls.obtenerDia(2);
		assertEquals(esperado, obtenido);
	}

}

