package ejercicios;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class VehiculosTest {
	Persona cacho, luis, ana, juana, sergio;

	@Before
	public void setUp() throws Exception {
		cacho = new Persona("cacho");
		luis = new Persona("luis");
		ana = new Persona("ana");
		juana = new Persona("juana");
		sergio = new Persona("sergio");
	}

	@Test
	public void crearMotoTest() {
		Motocicleta miMoto = new Motocicleta(0, cacho);
		assertNotNull(miMoto);
		assertEquals(0, miMoto.getKilometrosRecorridos());
	}

	@Test
	public void agregarAcompanianteTest() {
		Motocicleta miMoto = new Motocicleta(0, null);
		assertFalse(miMoto.agregarAcompaniante(cacho));

		miMoto = new Motocicleta(0, cacho);
		assertTrue(miMoto.agregarAcompaniante(ana));
	}

	@Test
	public void cambiarChoferTest() {
		Motocicleta miMoto = new Motocicleta(0, cacho);
		assertTrue(miMoto.agregarAcompaniante(ana));

		Autobus bondi = new Autobus(0, sergio, 20);
		bondi.subirPasajero(luis);
		bondi.subirPasajero(juana);

		assertFalse(bondi.cambiarChofer(luis));
		assertFalse(miMoto.cambiarChofer(sergio));

		bondi.bajarPasajero();
		bondi.bajarPasajero();

		assertTrue(bondi.cambiarChofer(luis));

	}

	@Test
	public void comoVehiculosTest() {
		Vehiculo miMoto = new Motocicleta(0, cacho);
		Vehiculo bondi = new Autobus(0, sergio, 20);

		System.out.println(miMoto);
		System.out.println(bondi);

		System.out.println("---------------------------------------");
		bondi = miMoto;

		System.out.println(miMoto);
		System.out.println(bondi);

		assertTrue(bondi.cambiarChofer(luis));
		System.out.println(miMoto.getChofer());
		System.out.println(bondi.getChofer());
		
		assertTrue(miMoto.cambiarChofer(sergio));
		
		System.out.println(miMoto.getChofer());
		System.out.println(bondi.getChofer());

	}

}