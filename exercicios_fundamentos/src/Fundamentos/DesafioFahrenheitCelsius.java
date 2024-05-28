package Fundamentos;

import java.util.Scanner;

public class DesafioFahrenheitCelsius {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Insira o valor de Fahren: ");
		
		Double Fahren = sc.nextDouble();
		
		Double Resultado = (Fahren - 32) * 5 / 9;
		
		System.out.println("Resultado é: " + Resultado);
		
		sc.close();
	}

}
