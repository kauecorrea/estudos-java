package curso_java;

import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		int idade = 18;
		double x = 10.85;
		double z = 10.68394;
		
		System.out.println("Kauê");
		
		System.out.println(idade);
		
		System.out.println(x);
		
		//para trocar o separador de decimais de , para . igual ao dos USA
		Locale.setDefault(Locale.US);
		// caso dê erro basta colocar o seguinte comando "import java.util.Locale;"
		
		//sysout
		
		System.out.printf("%.2f%n", z);
		
		System.out.printf("%.4f%n", z);
		
		System.out.printf("%.5f%n", z);

		// o printf é a abreviação de formatado. O %.2f significa que voce quer especificar duas casas decimais
		// se quiser colocar 4 casa decimais, só trocar o 2 por 4. Pode colocar qualquer numero que deseja para mostrar as casa decimais
		// O %n é a quebra de linha
		
		//AGORA VAMOS CONCATENAR VARIOS ELEMENTOS EM UMA MESMA LINHA DE COMANDO DE ESCRITA
		//Regra geral para print e println
		
		System.out.println("RESULTADO = " + z + " METROS");
		
		// O sinal de + serve para juntar os elementos escritos com a variavel que esta no meio
		
		//AGORA REGRA GERAL PARA printf
		
		System.out.printf("RESULTADO = %.2f METROS%n", z);
		
		
	}

}
