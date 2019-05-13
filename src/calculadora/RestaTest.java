package calculadora;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class RestaTest {

	@Test
	public void restaEnteros() {
		System.out.println("Resta enteros ...");
		Resta s = new Resta(4,2);
		assertTrue(s.restar() == 2);
	}
	@Test
	public void restaNegativas() {
		System.out.println("Resta negativos ...");
		Resta s = new Resta(-2,-3);
		assertTrue(s.restar() == 1);
	}
	@Test
	public void restaMixto() {
		System.out.println("Resta mixto ...");
		Resta s = new Resta(2,-3);
		assertTrue(s.restar() == 5);
	}

}
