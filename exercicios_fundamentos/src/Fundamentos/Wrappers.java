package Fundamentos;

public class Wrappers {

	public static void main(String[] args) {
		
		
		
		//byte
		Byte b = 100;
		Short s = 1000;
		
		//Integer.parseInt(sc.next());
		Integer i = 10000;  // int
		Long l = 100000L;
		
		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(i * 3);
		System.out.println(l / 3);
		
		Float f = 123.0F;
		System.out.println(f);
		
		Double d = 123.5678;
		System.out.println(d);
		
		//convertendo para string
		Boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo);
		System.out.println(bo.toString().toUpperCase());
		
		Character c = '#'; //char
		System.out.println(c.toString());
		//ou
		System.out.println(c + "...");
	}

}
