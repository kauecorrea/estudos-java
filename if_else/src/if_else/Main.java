package if_else;
import java.util.Scanner;
import java.util.Locale;
public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double negativo;
		
		System.out.println("Qual o valor?");
		negativo = sc.nextDouble();
		
		if (negativo >= 0) {
			System.out.println("NÃO NEGATIVO");
		}
		else {
			System.out.println("NEGATIVO");
			
		}
		sc.close();
	}

}
