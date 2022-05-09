/*
 * Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен
 * заданному е. Общий член ряда имеет вид:
 */

public class T5 {

	public static void main(String[] args) {
		int n = 5, e = 5;
		double[] mas = new double[n];

		// сформируем числовой ряд
		System.out.println("Числовой ряд из " + n + " элементов: ");
		
		for (int i = 0; i < n; i++) {
			mas[i] = 1 / Math.pow(2, i+1) + 1 / Math.pow(3, i+1);
			System.out.print(mas[i] + ", ");
		}
		
	}

}
