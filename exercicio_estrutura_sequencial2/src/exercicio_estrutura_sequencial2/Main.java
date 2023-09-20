package exercicio_estrutura_sequencial2;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		double raio;
		
		final double PI = 3.14159;
		
		System.out.println("Digite o valor do raio do círculo: ");
		
		raio = sc.nextDouble();
		
		double area = PI *Math.pow(raio, 2);
		
		System.out.printf("A área do círculo é: %.4f%n", area);
		
		sc.close();
	}

}
