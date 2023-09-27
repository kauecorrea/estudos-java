package if_else3;
import java.util.Scanner;
import java.util.Locale;
public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numero;
		int numero2;
		
		System.out.println("Insira 2 valores");
		numero = sc.nextInt();
		numero2 = sc.nextInt();
		
		if (numero % numero2 == 0 || numero2 % numero == 0) {
			System.out.println("Sao multiplos");	
		}
		else {
			System.out.println("nao sao multiplos");
		}
		
		sc.close();
	}

}
