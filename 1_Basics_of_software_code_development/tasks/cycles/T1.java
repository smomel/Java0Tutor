/*
 * Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует
 * все числа от 1 до введенного пользователем числа.
 */

import java.util.Scanner;

public class T1 {

	public static void main(String[] args) {
		long n, i, sum = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Введите целое положительное число: ");
		n = input.nextLong();
		
		for (i = 1; i <= n; i++) {
			sum += i;
		}
		
		System.out.println("Сумма чисел от 1 до " + n + " равна: " + sum);
		
        input.close();
	}

}
