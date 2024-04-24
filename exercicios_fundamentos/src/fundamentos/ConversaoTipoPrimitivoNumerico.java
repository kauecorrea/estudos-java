package fundamentos;

public class ConversaoTipoPrimitivoNumerico {

	public static void main(String[] args) {
		double a = 1; // implicita
		System.out.println(a);

		float b = (float) 1.2345678888; // explicita (CAST)
		// float b 1.0F; poderia ter sido feito assim tbm
		System.out.println(b);

		int c = 4;
		// se n fizer o CAST vai dar erro pq o java vai entender que vai ter perda de
		// dados
		// pq byte é menor que int, porem se tu fizer um CAST, o java passa
		byte d = (byte) c; // explicita (CAST)
		System.out.println(d);

		double e = 1.9999999;
		int f = (int) e; // explicita (CAST)
		System.out.println(f);

	}

}
