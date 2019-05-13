package calculadora;

import java.util.InputMismatchException;
import java.util.Scanner;
import calculadora.Suma;
import calculadora.Resta;
import calculadora.Multiplicacion;
import calculadora.Division;

public class Main {
	public static void main(String[] args) {
		boolean salir = false;
		while(!salir) {
			Scanner sc = new Scanner(System.in);
			System.out.println("****Calculadora*****");
			System.out.println();
			System.out.println("¿Qué deseas hacer?");
			System.out.println("1.- Sumar.");
			System.out.println("2.- Restar.");
			System.out.println("3.- Multiplicar");
			System.out.println("4.- Dividir");
			
			System.out.println("0.- Salir.");
			try {
				int opcion = sc.nextInt();
				switch(opcion) {
				case 1: sumar();break;
				case 2: restar();break;
				case 3: multiplicar();break;
				case 4: dividir();break;
				case 0: salir = true;break;
				default: System.out.println("Opcion incorrecta.");
				}
			}catch(InputMismatchException e) {
				System.out.println("Error, ha introducido un valor no numerico.");	
			}
		}
	}

	private static Suma sumar() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un numero: ");
		double num1 = sc.nextDouble();
		System.out.println("Introduce un numero: ");
		double num2 = sc.nextDouble();
		Suma s = new Suma(num1,num2);
		System.out.println(s.sumar());
		return s;
	}
	private static Resta restar() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un numero: ");
		double num1 = sc.nextDouble();
		System.out.println("Introduce un numero: ");
		double num2 = sc.nextDouble();
		Resta s = new Resta(num1,num2);
		System.out.println(s.restar());
		return s;
	}
	private static Multiplicacion multiplicar() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un numero: ");
		double num1 = sc.nextDouble();
		System.out.println("Introduce un numero: ");
		double num2 = sc.nextDouble();
		Multiplicacion s = new Multiplicacion(num1,num2);
		System.out.println(s.multiplicar());
		return s;
	}
	private static Division dividir() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un numero: ");
		double num1 = sc.nextDouble();
		System.out.println("Introduce un numero: ");
		double num2 = sc.nextDouble();
		Division s = new Division(num1,num2);
		System.out.println(s.dividir());
		return s;
	}
		
	}


