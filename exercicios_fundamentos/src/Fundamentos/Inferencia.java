package Fundamentos;

public class Inferencia {

	public static void main(String[] args) {
		
		double a = 4.9;
		System.out.println(a);
		
		/*
		 * o VAR serve para inferir/deduzir qual tipo de variavel que estamos usando
		 * sem declarar ela (como string, int, double e etc...)
		 */
		
		var b = 4.5;
		System.out.println(b);
		
		//porém o var não tem preferencia caso a mesma variavel seja declarada dnv
		
		var c = "texto";
		c = "outro texto";
		System.out.println(c);
		
		/* 
		 * caso eu queria dar um novo valor a uma variavel sem declarar qual vai ser
		 * a tipagem, vai dar erro pois o java já vai estar atrelado e irá dar prioridade
		 * quando a variavel foi declarada a tipagem (string, int, double, e etc...)
		 */
		
		//a = "...";
		//System.out.println(a);
		
		double d; // variavel declarada
		d = 123.65; // variavel foi inicializada
		System.out.println(d); // usada!

	}

}
