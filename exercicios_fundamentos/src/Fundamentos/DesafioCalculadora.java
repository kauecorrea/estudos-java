package Fundamentos;

import java.util.Scanner;
import java.util.Locale;

public class DesafioCalculadora {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Informe o número: ");
		double num1 = sc.nextDouble();

		System.out.print("Informe o número: ");
		double num2 = sc.nextDouble();

		System.out.print("Informe a operação: ");
		String op = sc.next();

		// Lógica
		double resultado = "+".equals(op) ? num1 + num2 : 0;
		resultado = "-".equals(op) ? num1 - num2 : resultado;
		resultado = "*".equals(op) ? num1 * num2 : resultado;
		resultado = "/".equals(op) ? num1 / num2 : resultado;
		resultado = "%".equals(op) ? num1 % num2 : resultado;

		System.out.printf("%.2f %s %.2f = %.2f", 
				num1, op, num2, resultado);

		sc.close();

	}

}