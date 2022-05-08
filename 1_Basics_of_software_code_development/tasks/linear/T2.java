/*
	Задача:
	Вычислите значение выражения по формуле (все переменные принимают действительные значения).
	Оригинал задачи содержит графическое отображение квадратного корня.
	Условие задачи в файле "Practice (tasks).pdf" в разделе "Линейные программы" под номером 2
*/

import java.util.Scanner;

public class T2 {

	public static void main(String[] args) {
		// объявляем переменные
		double a, b, c, z;
		Scanner input = new Scanner(System.in);
		
		// просим пользователя задать значения переменных
		System.out.print("Введите значение переменной 'a': ");
		a = input.nextDouble();		
		
		System.out.print("Введите значение переменной 'b': ");
		b = input.nextDouble();
			
		System.out.print("Введите значение переменной 'c': ");
		c = input.nextDouble();		
		
		// вычисляем значение выражения
		z = ((b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / (2 * a)) - Math.pow(a, 3) * c + Math.pow(b, -2);
		System.out.print("Значение выражения равно: " + z);
		
		input.close();
	}
	
}
