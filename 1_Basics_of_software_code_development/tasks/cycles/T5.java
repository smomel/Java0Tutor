/*
 * Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен
 * заданному е. Общий член ряда имеет вид:
 */

public class T5 {

	public static void main(String[] args) {
		int n = 10;
		double e = 0.00261, sum, an;

		System.out.println("Числовой ряд из " + n + " элементов: ");
		
		sum = 0;
		for (int i = 1; i <= n; i++) {
			an = Math.pow(2, -i) + Math.pow(3, -i); // вычисляем очередной член ряда
			System.out.print(an + ", ");			// выводим его на экран
			
			if (Math.abs(an) >= e) sum += an;		// если модуль больше заданной точности, суммируем
		}
		
		System.out.println("\nсумма членов ряда, больших по модулю " + e + " равна " + sum);
		
	}

}
