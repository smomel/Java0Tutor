/*
 * Даны действительные числа а 1 ,а 2 ,..., а n . Поменять местами наибольший и наименьший элементы.
 */
public class T4 {

	public static void main(String[] args) {
		int[] an; 
		int n = 20;
		int max, min;
		
		an = new int[n];
		System.out.println("Даны действительные числа:");
		
		// заполним массив случайными натуральными числами
		for (int i = 0; i < n; i++) {
			an[i] = (int) (Math.random() * n);
			System.out.print(an[i] + " ");
		}
		
		// предполагаем, что максимальный и минимальный элемент - это первый элемент
		min = max = an[0];
				
		// проходим массив и выясняем максимальный и минимальный элементы. запоминаем их индексы
		int indMax = 0, indMin = 0;
		for (int i = 1; i < an.length; i++) {
			
			if (an[i] > max) {max = an[i]; indMax = i; }
			if (an[i] < min) {min = an[i]; indMin = i; }
		}
		
		an[indMax] = min;
		an[indMin] = max;		
		
		System.out.println("Максимальное число: " + max + ", минимальное число: " + min + ". Последовательность после изменения:");
		
		for (int i = 0; i < n; i++) {			
			System.out.print(an[i] + " ");
		}

	}

}
