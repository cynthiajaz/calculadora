package calculadora;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MultiplicacionTest {

	@Test
	public void multiplicacionEnteros() {
		System.out.println("Multiplicacion enteros ...");
		Multiplicacion s = new Multiplicacion(4,2);
		assertTrue(s.multiplicar() == 8);
	}
	@Test
	public void multiplicacionNegativos() {
		System.out.println("Multiplicacion negativos ...");
		Multiplicacion s = new Multiplicacion(-3,-3);
		assertTrue(s.multiplicar() == 9);
	}
	@Test
	public void multiplicacionMixto() {
		System.out.println("Multiplicacion mixto ...");
		Multiplicacion s = new Multiplicacion(-4,2);
		assertTrue(s.multiplicar() == -8 );
	}


}
