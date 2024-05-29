package Fundamentos;

import java.util.Scanner;

public class DesafioAreaTriangulo {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Insira o valor da base do triangulo: ");
		Double base = sc.nextDouble();
		System.out.print("\nInsira a altura: ");
		Double altura = sc.nextDouble();
		
		Double Resultado = (base * altura) / 2;
		System.out.print("\nEsta é a area do triangulo: " + Resultado);
		
		sc.close();
	}

}
