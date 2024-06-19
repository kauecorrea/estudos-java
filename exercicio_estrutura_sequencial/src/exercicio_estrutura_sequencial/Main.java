package exercicio_estrutura_sequencial;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numero = sc.nextInt();
		int numero2 = sc.nextInt();
		//somar
		int soma = numero + numero2;
		
		System.out.println("SOMA = " + soma);
		
		sc.close();
	}

}
