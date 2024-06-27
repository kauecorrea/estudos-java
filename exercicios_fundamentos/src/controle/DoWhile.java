package controle;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		
		// if(...) sentenca; ou {}
		// while(...) sentenca; ou {}
		// for(...; ...; ...) sentenca; ou {}
		
		// do {} while(...);
		
		Scanner sc = new Scanner(System.in);
		
		String texto = "";
		
		do {
			System.out.println("Você precisa falar as palavras mágicas.");
			System.out.print("Quer sair? ");
			texto = sc.nextLine();
		} while(!texto.equalsIgnoreCase("por favor"));
		
		System.out.println("Obrigado!");
		
		sc.close();
		
	}

}
