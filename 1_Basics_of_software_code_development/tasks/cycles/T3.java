/*
 * Найти сумму квадратов первых ста чисел.
 */

public class T3 {

	public static void main(String[] args) {
		long sum = 0;
		
		for (int i = 1; i <= 100; i++) {
			sum += (i * i);
		}
		
		System.out.println("Сумма квадратов первых ста чисел равна: " + sum);

	}

}
