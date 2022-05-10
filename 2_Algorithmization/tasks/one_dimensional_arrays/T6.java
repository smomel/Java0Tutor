/*
 * Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых
 * являются простыми числами.
 */
public class T6 {

	public static void main(String[] args) {
		float[] an; 
		int n = 5;
		float sum = 0f;
		boolean isSimple;
		
		an = new float[n];
		System.out.println("Исходная последовательность:");
		
		// заполним массив случайными натуральными числами
		for (int i = 0; i < n; i++) {
			an[i] = (float) (Math.random() * n + 1);
			System.out.print(an[i] + " ");
			
			isSimple = true;
			for (int j = 2; j < (i+1); j++) {
				if ((i + 1) % j == 0) {
					isSimple = false;
					break;
				}
			}
			
			if (isSimple && (i+1 > 1)) sum += an[i];
			
		}
		
		System.out.println();
		System.out.println("Сумма элементов, порядковые номера которых простые числа: " + sum);

	}

}
