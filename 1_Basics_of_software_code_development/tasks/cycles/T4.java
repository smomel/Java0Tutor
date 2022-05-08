/*
 * Составить программу нахождения произведения квадратов первых двухсот чисел.
 */

public class T4 {

	public static void main(String[] args) {
		long res = 1;
		
		for (int i = 1; i <= 10; i++) {
			res *= (i * i);
		}
		
		System.out.println("Произведение квадратов первых двухсот чисел равно: " + res);
	}

}
