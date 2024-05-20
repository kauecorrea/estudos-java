package Fundamentos;

import java.util.Scanner;

public class TipoStringEquals {

	public static void main(String[] args) {
		System.out.println("2" == "2");
		
		String s = new String ("2");
		System.out.println("2" == s); // vai dar falso pq n é a msm coisa
		System.out.println("2".equals(s)); // vai dar true pq o equals vai comparar os conteudos das variaveis em si
		
		Scanner entrada = new Scanner(System.in);
		
		String s2 = entrada.next();
		System.out.println(s2);
		System.out.println("2" == s2.trim()); // trim serve para ele nao contar com espaços em branco e sim so com o numero
		System.out.println("2".equals(s2.trim()));
		
		entrada.close();
	}

}
