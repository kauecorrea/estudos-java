package fundamentos;

import java.util.Locale;
import java.util.Scanner;

public class DesafioConversao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println(Locale.getDefault());

		System.out.print("insira seu salario de janeiro: ");

		String janeiro = sc.next().replace(",", ".");

		System.out.print("\nInsira seu salario de fevereiro: ");
		String fevereiro = sc.next().replace(",", ".");

		System.out.print("\nInsira seu salario de março: ");
		String março = sc.next().replace(",", ".");

		double salario1 = Double.parseDouble(janeiro);
		double salario2 = Double.parseDouble(fevereiro);
		double salario3 = Double.parseDouble(março);

		double soma = salario1 + salario2 + salario3;
		System.out.println("a soma é: " + soma);
		System.out.println("a média é: " + soma / 3);
		sc.close();
	}

}
