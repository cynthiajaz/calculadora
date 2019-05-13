package calculadora;

public class Suma {
	
	private double num1;
	private double num2;
	
	public Suma(double n1, double n2) {
		num1 = n1;
		num2 = n2;
	}
	
	public double sumar() {
		double resultado = num1 + num2;
		return resultado;
	}

}
