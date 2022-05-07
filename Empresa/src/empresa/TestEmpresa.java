package empresa;

import org.junit.Assert;
import org.junit.Test;
/*
 * 	a)Un empleado de Planta Temporaria con 80 horas trabajadas, 
 * 		con esposa y sin hijos.
	b)Un empleado de Planta Permanente (que no sea gerente) 
		con 80 horas trabajadas, con esposa, 2 hijos y 6 años de antigüedad.
	c)Un empleado de Planta Permanente (que no sea gerente) 
		con 160 horas trabajadas, sin esposa, sin hijos y con 4 años de antigüedad.
	d)Un Gerente con 160 horas trabajadas, con esposa, un hijo y 10 años de antigüedad.
*/

public class TestEmpresa {

	@Test
	public void aTest() {
		Temporal pepe = new Temporal(true, 0, 80);
		double esperado = 16100;
		double obtenido = pepe.obtenerSueldo();
		Assert.assertEquals(esperado,obtenido,0.001);
		
	}
	
	@Test
	public void bTest() {
		Empleado pedro = new Permanente(true, 2, 80, 6);
		double esperado = 25100;
		double obtenido = pedro.obtenerSueldo();
		Assert.assertEquals(esperado,obtenido,0.001);
		
	}
	
	@Test
	public void cTest() {
		Empleado ana = new Permanente(false, 0, 160, 4);
		double esperado = 48400;
		double obtenido = ana.obtenerSueldo();
		Assert.assertEquals(esperado,obtenido,0.001);
		
	}
	
	@Test
	public void dTest() {
		Empleado raul = new Gerente(true, 1, 160, 10);
		double esperado = 65800;
		double obtenido = raul.obtenerSueldo();
		Assert.assertEquals(esperado,obtenido,0.001);
		
	}
	
	@Test
	public void liquidarTest() {
		Empleado pepe = new Temporal(true, 0, 80);
		Empleado pedro = new Permanente(true, 2, 80, 6);
		Empleado ana = new Permanente(false, 0, 160, 4);
		Empleado raul = new Gerente(true, 1, 160, 10);
		
		Empresa acme = new Empresa(4);
		
		acme.agregarEmpleado(raul);
		acme.agregarEmpleado(pepe);
		acme.agregarEmpleado(pedro);
		acme.agregarEmpleado(ana);
		
		double esperado = 155400; 
		double obtenido = acme.montoTotal();
		Assert.assertEquals(esperado,obtenido,0.00001);
			
	}
	

}