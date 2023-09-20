package exercicio_trapezio;

public class Main {

	public static void main(String[] args) {
		
		double b, B, h, area;
		
		b = 6.0;
		B = 8.0;
		h = 5.0;
		
		area = (b + B) / 2.0 * h;
		
		System.out.println(area);
		
		int a, c;
		double resultado;
		
		a = 5;
		c = 2;
		
		resultado = (double) a / c;
		
		//como as variaveis a, c estao como numeros inteiros, o resultado vai ser dado como inteiro tbm
		//para resolver isso nós fazemos um casting que é colocar o (double)
		
		System.out.println(resultado);

	}

}
