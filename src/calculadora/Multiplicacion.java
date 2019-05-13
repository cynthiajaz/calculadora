package calculadora;

public class Multiplicacion {
	
	private double num1;
	private double num2;
	
	public Multiplicacion(double n1, double n2) {
		num1 = n1;
		num2 = n2;
	}
	
	public double multiplicar() {
		double resultado = num1 * num2;
		return resultado;
	}

}
