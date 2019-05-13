package calculadora;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DivisionTest {

	@Test
	public void divisionEnteros() {
		System.out.println("Division enteros ...");
		Division s = new Division(4,2);
		assertTrue(s.dividir() == 2);
	}
	@Test
	public void divisonNegativos() {
		System.out.println("Division negativos ...");
		Division s = new Division(-3,-3);
		assertTrue(s.dividir() == 1);
	}
	@Test
	public void divisionMixto() {
		System.out.println("Division mixto ...");
		Division s = new Division(-4,2);
		assertTrue(s.dividir() == -2);
	}

}
