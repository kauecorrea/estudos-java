package Fundamentos;

import java.util.Scanner;

public class DesafioQuadradoCubo {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Insira o valor: ");
		Double valor = sc.nextDouble();
		Double ResultadoQua = Math.pow(valor, 2);
		System.out.print("Este é o valor ao quadrado: " + ResultadoQua);
		
		Double ResultadoCubo = Math.pow(valor, 3);
		System.out.println("\nEste é o valor ao cubo: " + ResultadoCubo);
		
		
		sc.close();
		}
}
