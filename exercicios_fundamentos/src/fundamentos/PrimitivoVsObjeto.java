package fundamentos;

public class PrimitivoVsObjeto {

	public static void main(String[] args) {

		// quando for usar mt um texto ou mensagem, pode se usar assim tbm pq aí podemos
		// usar a notação.ponto
		String s = new String("texto");
		s.toUpperCase();

		// Wrappers são a versão objeto dos tipos
		// primitivos!
		int a = 123;
		System.out.println(a);

	}

}
