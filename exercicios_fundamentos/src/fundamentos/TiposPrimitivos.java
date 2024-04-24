package fundamentos;

public class TiposPrimitivos {

	public static void main(String[] args) {
		/*
		 *  TIPOS PRIMITIVOS POR ORDEM DE CAPACIDADE
		 *  
		 *  numeros inteiros:
		 *  byte
		 *  short
		 *  int
		 *  long
		 *  
		 *  numeros com pontos flutuantes:
		 *  float
		 *  double
		 *  
		 *  caracteres:
		 *  char
		 *  
		 *  true and false:
		 *  boolean
		 */
		
		// Informações do funcionario
		
		// Tipos numéricos inteiros
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		/*
		 * as vezes o java pode considerar o valor do long como int (caso ele seja mt extenso), 
		 * para deixar mais claro
		 * coloca-se a letra L ou l no final para deixar claro que é um long
		 */
		long pontosAcumulados = 3_234_845_223L;
		
		// Tipos numéricos reais
		float salario = 11_445.44F;
		// para identificar o valor como float coloca-se um "F" or "f" no final
		double vendasAcumuladas = 2_991_797_103.01;
		
		// Tipo booleano
		boolean estaDeFerias = false; //true
		
		// Tipo caractere
		char status = 'A'; //ativo
		// apesnas 1 caractere
		
		// Dias de empresa
		System.out.println(anosDeEmpresa * 365);
		
		// Número de viagens
		System.out.println(numeroDeVoos / 2);
		
		// Pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		System.out.println( id + ": ganha -> " + salario);
		System.out.println( "Férias? " + estaDeFerias);
		System.out.println("Status: " + status);

	}

}
