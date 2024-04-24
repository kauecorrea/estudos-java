package fundamentos;

import java.util.Scanner;
import java.util.Locale;

public class Temperatura {

	public static void main(String[] args) {
		// (°F - 32) x 5/9 = °C
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		double F = sc.nextDouble();
		double F2 = 32;

		double div = 5.0 / 9.0;
		double C = (F - F2) * div;

		System.out.println("O resultado é: " + C);

		sc.close();

	}

}
