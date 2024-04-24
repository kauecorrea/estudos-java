package fundamentos;

public class Area_circuferencia {

	public static void main(String[] args) {
		double raio = 3.4;
		// colocar o nome da variavel em maiusculo
		final double PI = 3.14159;
		// final serve para tornar a variavel inaltevarel, caso a
		// variavel pi receba outro valor dps no codigo, vai dar erro
		double area = PI * raio * raio;

		System.out.println(area);

		raio = 10;
		area = PI * raio * raio;
		System.out.println("Área = " + area);
	}

}
