/*
 * Дан целочисленный массив с количеством элементов п. Сжать массив, выбросив из него каждый второй
 * элемент (освободившиеся элементы заполнить нулями). Примечание. Дополнительный массив не использовать.
 */
public class T10 {

	public static void main(String[] args) {
		int[] an;
		int n = 7;
		
		an = new int[n];
		System.out.println("Элементы массива:");
		
		// заполним массив случайными натуральными числами
		for (int i = 0; i < n; i++) {
			an[i] = (int) (Math.random() * n + 1);
			System.out.print(an[i] + " ");
		}
		
		for (int i = 1; i <= an.length / 2; i++) {			
			
			// сдвигаем все элементы влево на один, т.е. как бы выбрасываем элемент
			for (int j = i; j < an.length - 1; j++) {
				an[j] = an[j+1];
			}
			
			// на последнее место записываем 0
			an[an.length - 1] = 0;
		}
		
		// выводим результат
		System.out.println();
		System.out.println("Сжатый массив: ");
		for (int i = 0; i < n; i++) {
			System.out.print(an[i] + " ");
		}
	}

}
