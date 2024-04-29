package Fundamentos.operadores;

public class DesafioAritimetico {

	public static void main(String[] args) {
		
		double eq1 = 6 * (3 + 2);
		double pt1 = Math.pow(eq1, 2);
		double eq11 = 3 * 2;
		
		double result1 = pt1 / eq11;
		System.out.println(result1);
		
		double eq2 = (1 - 5) * (2 - 7) / 2;
		double pt2 = Math.pow(eq2, 2);
		System.out.println(pt2);
		
		double result2 = result1 - pt2;
		double pt3 = Math.pow(result2, 3);
		System.out.println(pt3);
		double pt4 = Math.pow(10, 3);
		
		double resultfinal1 = pt3 / pt4;
		System.out.println(resultfinal1);

	}

}
