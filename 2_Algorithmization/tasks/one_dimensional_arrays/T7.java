/*
 * Даны действительные числа a 1 , a 2 , ... , a 2n . Найти
 * max( a 1 + a 2 n , a 2 + a 2 n − 1 , ... , a n + a n + 1 )
 */
public class T7 {

	public static void main(String[] args) {
		int[] an;
		int n = 20;
		int max, tmp;
		
		an = new int[n];
		System.out.println("Исходные числа:");
		
		// заполним массив случайными натуральными числами
		for (int i = 0; i < n; i++) {
			an[i] = (int) (Math.random() * n + 1);
			System.out.print(an[i] + " ");
		}
		
		// предполагаем, что сумма первого и последнего элементов будет максимальной
		max = an[0] + an[an.length - 1];
		
		System.out.println("\nИщем максимальное значение среди элементов: ");
		System.out.print(max + " ");
		for (int i = 1; i < an.length / 2; i++) {
			tmp = an[i] + an[an.length - 1 - i];
			System.out.print(tmp + " ");
			
			max = (tmp > max) ? tmp : max;
		}
		
		System.out.println();
		System.out.println("Решение: " + max);

	}

}
