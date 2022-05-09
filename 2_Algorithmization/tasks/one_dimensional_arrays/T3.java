/* 
 * Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных,
 * положительных и нулевых элементов.
 */
public class T3 {
	
	public static void main(String[] args) {
		int[] an; 
		int numNegative = 0, numPositive = 0, numZero = 0, n = 50, z;
		
		an = new int[n];
		System.out.println("Элементы массива:");
		
		// заполним массив случайными натуральными числами
		for (int i = 0; i < n; i++) {
			
			double tmp = Math.random();
			if (tmp < 0.4) z = -1;
			else if (tmp > 0.6) z = 1;
			else z = 0;
			
			an[i] = (int) (Math.random() * 10 * z);
			
			System.out.print(an[i] + " ");
			
			// производим нужные подсчеты
			if (an[i] < 0 ) numNegative++;
			else if (an[i] > 0 ) numPositive++;
			else numZero++;
			
		}
		
		System.out.println();
		System.out.println("Число отрицательных элементов: " + numNegative);
		System.out.println("Число положительных элементов: " + numPositive);
		System.out.println("Число нулевых элементов: " + numZero);
	}

}
