import java.util.Scanner;

/*
 * Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа.
 * m и n вводятся с клавиатуры.
 */

public class T7 {

	public static void main(String[] args) {
		int m, n;
		boolean flag;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Введите начало промежутка m: ");
		m = input.nextInt();
		
		System.out.print("Введите конец промежутка n: ");
		n = input.nextInt();
		
		// перебираем все числа в заданном диапазоне
		for (int i = m; i <= n; i++) {
			System.out.print("Делителями для числа " + i + " будут (кроме 1 и " + i + "): ");
			
			// отсекаем сразу частный случай с числами 1-3. Их нет смысла обрабатывать, если они попали в диапазон
			switch (i) {
				case 1 : case 2 : case 3 : {
					System.out.println("-");
					continue;
				}
			}
			
			// предполагаем, что делителей нет
			flag = false;
			
			// перебираем делители числа и выводим нужные
			// перебирать делители дальше чем половина числа не имеет смысла, т.к. там их никогда не будет
			for (int j = 2; j <= i / 2; j++) {
				
				if (i % j == 0) {
					System.out.print(j + " ");
					flag = true; // изменяем флаг наличия делителей
				}
				
			}
			
			// если делители не нашлись, то выводим прочерк
			if (!flag) {
				System.out.print("-");
			}
			
			System.out.print("\n");
		}
		
		input.close();
	}

}
