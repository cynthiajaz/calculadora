package calculadora;

public class Resta {
	
	private double num1;
	private double num2;
	
	public Resta(double n1, double n2) {
		num1 = n1;
		num2 = n2;
	}
	
	public double restar() {
		double resultado = num1 - num2;
		return resultado;
	}

}
