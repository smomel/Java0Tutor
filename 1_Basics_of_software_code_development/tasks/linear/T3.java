/*
 * Задача:
 * Вычислите значение выражения по формуле (все переменные принимают действительные значения):
 * (sin x + cos y) / (cos x - sin y) * tg x*y
 * */

import java.util.Locale;
import java.util.Scanner;

public class T3 {

	public static void main(String[] args) {
		// объявление переменных
		double x, y, z;
		Scanner input = new Scanner(System.in).useLocale(Locale.ENGLISH);		
		
		// просим пользователя ввести значения переменных
		System.out.print("Введите значение переменной 'x': ");
		x = input.nextDouble();
		
		System.out.print("Введите значение переменной 'y': ");
		y = input.nextDouble();
		
		
		z = (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) * Math.tan(x * y);
		
		System.out.println("Значение выражения равно: " + z);
				
		input.close();
	}

}
