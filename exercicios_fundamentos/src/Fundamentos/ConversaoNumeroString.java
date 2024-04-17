package Fundamentos;

public class ConversaoNumeroString {

	public static void main(String[] args) {
		//uma forma de converter integer para string
		Integer num1 = 10000;
		System.out.println(num1.toString().length()); // .length serve para saber quantos caracteres tem
		
		//outra forma de converter
		int num2 = 100000;
		System.out.println(Integer.toString(num2).length());
		
		
	}

}
