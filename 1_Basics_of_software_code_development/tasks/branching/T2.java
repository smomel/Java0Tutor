/*
 * Найти max{min(a, b), min(c, d)}.
 */

public class T2 {

	public static void main(String[] args) {
		double a = 3;
		double b = 5;
		double c = 10;
		double d = 20;
		double min1, min2, max;
		
		min1 = (a < b) ? a : b;
		min2 = (c < d) ? c : d;
		
		max = (min1 > min2) ? min1 : min2;
		
		System.out.println("Результат: " + max);		
	}

}
