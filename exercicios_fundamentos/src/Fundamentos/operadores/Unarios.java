package Fundamentos.operadores;

public class Unarios {

	public static void main(String[] args) {
		
		int a = 1;
		int b = 2;
		
		// serve para qualquer tipo de variavel de numero;
		
		a++; // a = a + 1;
		a--; // a = a - 1;
		
		++b; // b = b + 1;
		--b; // b = b - 1;
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("Mini Desafio...");
		// deu true pois antes do java fazer a comparação do a com o b, ele tinha virado 2 e o b
		// ainda n tinha sido subtraido
		System.out.println(++a == b--);
		//por isso aq dá false
		System.out.println(a == b);
		System.out.println(a);
		System.out.println(b);
	}

}
