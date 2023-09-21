package exercicio_estrutura_sequencial3;
import java.util.Scanner;
import java.util.Locale;
public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		// Declare as variáveis para armazenar os valores A, B, C e D
        int A, B, C, D;
        
        // Solicite ao usuário que insira os valores
        System.out.print("Digite o valor de A: ");
        A = sc.nextInt();
        
        System.out.print("Digite o valor de B: ");
        B = sc.nextInt();
        
        System.out.print("Digite o valor de C: ");
        C = sc.nextInt();
        
        System.out.print("Digite o valor de D: ");
        D = sc.nextInt();
        
        // Calcule a diferença conforme a fórmula
        int diferenca = (A * B) - (C * D);
        
        // Exiba o resultado
        System.out.println("A diferença do produto de A e B pelo produto de C e D é: " + diferenca);
        
		sc.close();

	}

}
