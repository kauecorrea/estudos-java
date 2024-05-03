package Fundamentos.operadores;

public class Logicos {

	public static void main(String[] args) {
		boolean condicao1 = true;
		boolean condicao2 = 3 > 7;
		
		System.out.println(condicao1 && condicao2);
		System.out.println(condicao1 || condicao2);
		System.out.println(condicao1 ^ condicao2);
		System.out.println(!!condicao1);
		System.out.println(!condicao2);
		
		//todos tem que ser verdadeiro (AND , &&)
		System.out.println("\nTabela verdade E");
		System.out.println(true && true);
		System.out.println(true && false);
		//System.out.println(false && true);
		//System.out.println(false && false);
		
		// um sendo verdadeiro ja dá true (OR, ||)
		System.out.println("\nTabela Verdade OU");
		//System.out.println(true || true);
		//System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		
		//só pode ter um verdadeiro, ou é um ou é outro. pegou a parada? (XOR, ^)
		System.out.println("\nTabela Verdade OU Exclusivo (XOR)");
		System.out.println(true ^ true);
		System.out.println(true ^ false);
		System.out.println(false ^ true);
		System.out.println(false ^ false);
		
		// ele nega. se for verdadeiro e colocar ele, ele vira falso
		// se for falso e colocar ele, ele vira verdadeiro (NOT, !)
		System.out.println("\nTabela Verdade NOT");
		System.out.println(!true);
		System.out.println(!false);
		
	}

}