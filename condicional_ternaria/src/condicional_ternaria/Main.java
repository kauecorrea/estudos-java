package condicional_ternaria;
import java.util.Scanner;
import java.util.Locale;
public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);

		//sintaxe:
		//( condição ) ? valor_se_verdadeiro ; valor_se_falso
		//( 2 > 4 )? 50 : 80 ====> 80
		//( 10 != 3 ) ? "Maria" : "Alex" ====> "Maria"
		
		//EXEMPLO:
		
		double preco = 34.5;
		double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;
		
		System.out.println(desconto);
		sc.close();
	}

}
