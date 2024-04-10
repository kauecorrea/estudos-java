package Fundamentos;

import java.util.Scanner;

public class NotacaoPonto {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		String s = "Bom dia X";
		/* 
		 * o .REPLACE serve para substituir a ultima uma caractere no caso o "X"
		 * foi substituido por "Senhora"
		 */
		s = s.replace("X", "Senhora");
		// O .UPPERCASE serve para deixar tudo maiusculo
		s = s.toUpperCase();
		
		s = s.concat("!!!");
		
		System.out.println(s);

		//System.out.println("Leo".toUpperCase());
		
		//OU
		
		String x = "Leo".toUpperCase();
		
		System.out.println(x);
		
		// Fazendo com o replace agora
		
		String y = "Bom dia X".replace("X", "Gui");
		
		System.out.println(y);
		
		
		// TESTANDO COM O SCANNER!!
		
		System.out.printf("Qual seu nome: ");
		String name = sc.next();
		
		String BomDia = "Bom dia, X".replace("X", name).toUpperCase().concat("!!!");
		System.out.println(BomDia);
		
		// .REPLACE = SUBSTITUIR UM CARACTERE OU PALAVRA POR OUTRA COISA
		// .UPPERCASE = FICAR MAIUSCULO
		// .CONCAT = CONCATENAR
		
		// Usando o scanner ficou bem interessante o REPLACE
		// pois me dá varias possibilidades dentro do codigo
		
		
		//Tipos primitivos nao tem o operador "."
		
		//int a = 3;
		//a.
		
		sc.close();
	}

}
