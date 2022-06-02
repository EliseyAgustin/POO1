package unidades;

import static org.junit.Assert.*;

import org.junit.Test;

public class JuegoEstrategiaTest {

	@Test
	public void soldadosTest() {
		Soldado rambo = new Soldado(new Punto(1,1));
		Soldado conan = new Soldado(new Punto(1,1));
		rambo.atacar(conan);
		
		assertEquals(90, rambo.getEnergia());
		assertEquals(190, conan.getSalud());
		
		while(rambo.puedeAtacar(conan)) {
			rambo.atacar(conan);
		}
		
		assertEquals(100, conan.getSalud());
		assertEquals(0, rambo.getEnergia());
		
		assertTrue(conan.puedeAtacar(rambo));
		
		
	}
	
	@Test
	public void arquerosTest() {
		Arquero robin = new Arquero(new Punto(1,2));
		Arquero legolas = new Arquero(new Punto(1,2));
		robin.atacar(legolas);
		
        assertEquals(80, robin.puedeAtacar(legolas));
		assertEquals(110, legolas.getSalud());
		
		while(robin.puedeAtacar(legolas)) {
			robin.atacar(legolas);
		}
		
		assertEquals(100, legolas.getSalud());
		assertEquals(0, robin.getSalud());
		
		assertTrue(legolas.puedeAtacar(robin));
	}
	
	@Test
	public void LanceroTest() {
		Lancero zeigfrid = new Lancero(new Punto(1,8));
		Lancero lara = new Lancero(new Punto(1,1));
		zeigfrid.atacar(lara);
		
        assertEquals(180, zeigfrid.puedeAtacar(lara));
		assertEquals(130, lara.getSalud());
		
		while(zeigfrid.puedeAtacar(lara)) {
			zeigfrid.atacar(lara);
		}
		
		assertEquals(100, lara.getSalud());
		assertEquals(0, zeigfrid.getSalud());
		
		assertTrue(lara.puedeAtacar(zeigfrid));
	}
	
	@Test
	public void CaballoTest() {
		Caballo silver = new Caballo();
		Caballo tornado= new Caballo();
		silver.incrementarAtaque();
		
        assertEquals(80, silver.getCantAtaques());
		assertEquals(10, tornado.isRebelde());
		
		while(silver.isRebelde()) {
			silver.setCantAtaques(3);
		}
		
		assertEquals(100, tornado.isRebelde());
		assertEquals(0, silver.isRebelde());
		
		assertTrue(tornado.isRebelde());
	}
	
}



