/*
 * Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует
 * все числа от 1 до введенного пользователем числа.
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class T1 {

	public static void main(String[] args) {
		long n, sum = 0;
		boolean ok = true;
		Scanner input = new Scanner(System.in);
		
		try {
			System.out.print("Введите целое положительное число: ");
			n = input.nextLong();
			
			for (long i = 1; i <= n; i++) {								
				sum += i;
				
				if (sum < 0) {
					System.out.println("Переполнение. i = " + i);
					ok = false;
					break;
				}				
			}
			
			if (ok) {
				System.out.println("Сумма чисел от 1 до " + n + " равна: " + sum);
			}			
						
		} catch (InputMismatchException e) {
			if (e.getMessage() == null) {
				System.out.println("Неверный формат ввода.");
			} else {
				System.out.println("Максимальное значение 'n' может быть: " + Long.MAX_VALUE);
			}
		}
				
        input.close();
	}

}
