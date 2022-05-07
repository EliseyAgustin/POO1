package encapsulamiento;

import static org.junit.Assert.*;

import org.junit.Test;

public class PuntoTest {

	@Test
	public void estaSobreXtest() {
		Punto p1 = new Punto(0,0);
		Punto p2 = new Punto(4,0);
		Punto p3 = new Punto(-3.5,0);
		Punto p4 = new Punto(5.0,5.0);
		
		assertTrue(p1.estaSobreElEjeX());		
		assertTrue(p2.estaSobreElEjeX());
		assertTrue(p3.estaSobreElEjeX());
		assertFalse(p4.estaSobreElEjeX());
	}
	
	@Test
	public void estaSobreYtest() {
		Punto p1 = new Punto(0,0);
		Punto p2 = new Punto(0,4);
		Punto p3 = new Punto(0,-3.5);
		Punto p4 = new Punto(5.0,5.0);
		
		assertTrue(p1.estaSobreElEjeY());		
		assertTrue(p2.estaSobreElEjeY());
		assertTrue(p3.estaSobreElEjeY());
		assertFalse(p4.estaSobreElEjeY());
	}
	
	@Test
	public void estElOrigenDeCoordenadasTes() {
		Punto p1 = new Punto(0,0);
		Punto p2 = new Punto(0,4);
		Punto p3 = new Punto(0,-3.5);
		Punto p4 = new Punto(5.0,5.0);
		
		assertTrue(p1.esElOrigenDeCoordenadas());		
		assertFalse(p2.esElOrigenDeCoordenadas());
		assertFalse(p3.esElOrigenDeCoordenadas());
		assertFalse(p4.esElOrigenDeCoordenadas());
		
	}

}
