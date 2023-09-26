package if_else2;
import java.util.Scanner;
import java.util.Locale;
public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int valor;
		
		System.out.println("Qual o valor?");
		valor = sc.nextInt();
		
		if (valor % 2 == 0 ) {
			System.out.println("PAR");
		}
		else {
			System.out.println("IMPaR");
		}
		
		sc.close();
	}

}
