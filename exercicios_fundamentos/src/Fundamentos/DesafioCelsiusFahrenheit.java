package Fundamentos;

import java.util.Scanner;

public class DesafioCelsiusFahrenheit {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Insira o valor de Celsius: ");
		Double Celsius = sc.nextDouble();
		
		Double Resultado = (Celsius * 9/5) + 32;
		
		System.out.println("Resultado é: " + Resultado);

		sc.close();

	}

}
