package scanner;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//Para ler vários dados na mesma linha
		//string x;
		//int y;
		//double z;
		//x = sc.next();
		//y = sc.nextInt();
		//z = sc.nextDouble();
		
		//Para ler um caractere
		//Suponha uma variável tipo char declarada:
		//char x;
		//x = sc.next().charAt(0);
		
		
		String s1, s2, s3;
		
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		
		//nextLine serve para ler um texto ate a quebra de linha
		
		System.out.println("DADOS DIGITADOS:");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		sc.close();
	}
}