/*
 * В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.
 */

public class T1 {

	public static void main(String[] args) {
		int[] an; 
		int K = 2, sum = 0, n = 20;
		
		an = new int[n];
		System.out.println("Элементы массива:");
		
		// заполним массив случайными натуральными числами
		for (int i = 0; i < n; i++) {
			an[i] = (int) (Math.random() * n + 1);
			
			System.out.print(an[i] + " ");
			// если число кратно К, то суммируем его
			if (an[i] % K == 0) sum += an[i];
		}
		
		System.out.println();
		System.out.println("Сумма элементов, кратных " + K + " = " + sum);
	}

}
