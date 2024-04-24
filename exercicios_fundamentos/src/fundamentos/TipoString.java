package fundamentos;

public class TipoString {

	public static void main(String[] args) {
		
		// .charAt(); serve para puxar uma caractere especifica de acordo com a posição
		// dela
		System.out.println("Olá pessoal".charAt(2));

		String s = "Boa tarde";

		// podemos concatenar com o .concat
		System.out.println(s.concat("!!!"));
		// ou com o +
		System.out.println(s + "!!!");

		// .startsWith() serve para verificar se o inicio ("starts") da variavel é
		// verdadeiro de acordo com a variavel puxada
		System.out.println(s.startsWith("Boa"));
		// caso nao tivesse o Lowercase o resultado seria False pois nao começa com
		// letra minusculo o "boa"
		// porém usamos o Lowercase que deixa maiusculo
		System.out.println(s.toLowerCase().startsWith("boa"));

		// .endsWith serve para verificar se o final ("ends") da variavel é verdadeiro
		// de acordo com a variavel puxada
		System.out.println(s.endsWith("tarde"));
		// caso nao tivesse o Lowercase o resultado seria False pois nao começa com
		// letra minusculo o "boa"
		// porém usamos o Lowercase que trocou e deixou minusculo
		System.out.println(s.toUpperCase().endsWith("TARDE"));

		// .length serve para saber quantas caracteres esta sendo usada
		System.out.println(s.length());

		// .equals serve para comparar as variaveis inteiras para ver se ta igual se sim
		// true se nao false
		System.out.println(s.equals("boa tarde"));
		// .equalsIgnoreCase faz a mesma coisa porém ignora se esta minusculo ou
		// maiusculo
		System.out.println(s.equalsIgnoreCase("boa tarde"));

		var nome = "Pedro";
		var sobrenome = "Santos";
		var idade = 33;
		var salario = 12345.987;

		// o \n serve para quebrar linha no println
		System.out
				.println("Nome: " + nome + "\nSobrenome: " + sobrenome + "\nIdade: " + idade + "\nSalario: " + salario);

	}

}
