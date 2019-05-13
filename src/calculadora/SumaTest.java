package calculadora;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import suma.Suma;

class SumaTest {

	@Test
	public void sumaEnteros() {
		System.out.println("Suma enteros ...");
		Suma s = new Suma(2,3);
		assertTrue(s.sumar() == 5);
	}
	@Test
	public void sumaNegativos() {
		System.out.println("Suma negativos ...");
		Suma s = new Suma(-2,-3);
		assertTrue(s.sumar() == -5);
	}
	@Test
	public void sumaMixto() {
		System.out.println("Suma mixto ...");
		Suma s = new Suma(2,-3);
		assertTrue(s.sumar() == -1);
	}


}
