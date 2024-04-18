package Fundamentos;

import java.util.Scanner;



public class DesafioConversao {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("insira seu salario de janeiro: ");
		
		String janeiro = sc.nextLine();
		
		System.out.println("Insira seu salario de fevereiro: ");
		String fevereiro = sc.nextLine();
		
		System.out.println("Insira seu salario de março: ");
		String março = sc.nextLine();
		
		double salario1 = Double.parseDouble(janeiro);
		double salario2 = Double.parseDouble(fevereiro);
		double salario3 = Double.parseDouble(março);
		
		double soma = (janeiro + fevereiro) + março;
		System.out.println("a soma é: " + soma);
		System.out.println("a média é: " + soma / 2);
		sc.close();
	}

}
