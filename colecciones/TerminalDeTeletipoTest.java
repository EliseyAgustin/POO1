package colecciones;

import static org.junit.Assert.*;

import org.junit.Test;

public class TerminalDeTeletipoTest {

	@Test
	public void cadenaNulaTest() {
		TerminalDeTeletipo tt = new TerminalDeTeletipo();
		String esperado = "";
		String obtenido = tt.teletipear("");
		assertEquals(esperado, obtenido);
		
	}
	
	@Test
	public void enunciadoTest() {
		TerminalDeTeletipo tt = new TerminalDeTeletipo();
		String esperado = "ae";
		String obtenido = tt.teletipear("abc/d//e");
		assertEquals(esperado, obtenido);
		
	}
	
	@Test
	public void enunciadoConYYTest() {
		TerminalDeTeletipo tt = new TerminalDeTeletipo();
		String esperado = "e";
		String obtenido = tt.teletipear("abc&d//e");
		assertEquals(esperado, obtenido);
		
	}

}