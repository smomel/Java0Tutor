/*
 * Дана последовательность целых чисел a 1 , a 2 , .. , a n . Образовать новую последовательность, выбросив из
 * исходной те члены, которые равны min( a 1 , a 2 , .. , a n )
 */
public class T8 {

	public static void main(String[] args) {
		int[] an, newA;
		int n = 20;
		int min, colMin;
		
		an = new int[n];
		System.out.println("Исходная последовательность:");
		
		// заполним массив случайными натуральными числами
		for (int i = 0; i < n; i++) {
			an[i] = (int) (Math.random() * n + 1);
			System.out.print(an[i] + " ");
		}
		
		min = an[0];
		
		// найдем минимальный элемент в последовательности
		for (int i = 1; i < an.length; i++) {
			min = (an[i] < min) ? an[i] : min;
		}
		
		System.out.println();
		System.out.println("Минимальный элемент последовательности: " + min);
		
		// определим количество элементов исходной последовательности, равных найденному минимальному значению
		colMin = 0;
		for (int i = 0; i < an.length; i++) {
			colMin = (an[i] == min) ? colMin + 1 : colMin;
		}
		
		System.out.println("Количество элементов, равных минимальному:  " + colMin);
		
		// сформируем новую последовательность, выбросив из исходной минимальный
		System.out.println("Новая последовательность:");
		newA = new int[an.length - colMin];
		int j = 0;
		for (int i = 0; i < an.length; i++) {
			if (an[i] != min) {
				newA[j] = an[i];
				System.out.print(newA[j] + " ");
				j++;
			}
		}

	}

}
