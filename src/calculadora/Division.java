package calculadora;

public class Division {
	
	private double num1;
	private double num2;
	
	public Division(double n1, double n2) {
		num1 = n1;
		num2 = n2;
	}
	
	public double dividir() {
		double resultado = num1 / num2;
		return resultado;
	}

}
