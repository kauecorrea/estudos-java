package fundamentos;

import java.util.Scanner;

public class Console {

	public static void main(String[] args) {

		System.out.print("Bom");
		System.out.print(" dia! \n\n");

		System.out.println("Bom");
		System.out.println("dia!");

		// podemos quebrar linha com %n ou \n

		System.out.printf("Megasena: %d %d %d %d %d %d %n", 1, 2, 3, 4, 5, 6);

		// podemos declarar uma variavel dentro do printf
		/*
		 * como declarar: %s = string %d = double %f = float e etc... so usando a
		 * inicial
		 */
		System.out.printf("Salário: %.1f%n", 1234.5678);

		System.out.printf("Nome: %s%n", "João");

		// scanner serve fazer uma entrada de dados usando seu teclado

		Scanner sc = new Scanner(System.in);

		// o nextLine serve para String

		System.out.print("Digite seu nome: ");
		String nome = sc.nextLine();

		System.out.print("Digite seu sobrenome: ");
		String sobrenome = sc.nextLine();

		System.out.print("Digite a sua idade: ");
		int idade = sc.nextInt();

		// nas seguintes linhas vai ter duas formas de concatenar

		System.out.print("\n\nNome = " + nome + " " + sobrenome + "\nidade: " + idade + " anos!");

		// so funciona no printf

		System.out.printf("\n%s %s tem %d anos.", nome, sobrenome, idade);

		sc.close();

	}

}
