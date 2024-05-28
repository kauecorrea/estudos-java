package Fundamentos;

import java.util.Scanner;

public class DesafioIMC {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Insira seu peso: ");
		Double peso = sc.nextDouble();
		
		System.out.print("Insira sua altura: ");
		Double altura = sc.nextDouble();
		
		Double Resultado = peso / Math.pow(altura, 2);
		System.out.println("O resultado é: " + Resultado);
		
		
		sc.close();

	}

}
