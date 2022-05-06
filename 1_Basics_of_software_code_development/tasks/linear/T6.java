/*
 * Задача:
 * Для данной области составить линейную программу, которая печатает true, если точка с координатами (х, у)
 * принадлежит закрашенной области, и false - в противном случае
 * Изображение области находится в файле "Practice (tasks).pdf" в разделе "Линейные программы", задача №6
 */

import java.util.Scanner;

public class T6 {

	public static void main(String[] args) {
		int x, y;
		boolean res;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Введите координату x: ");
		x = input.nextInt();
		
		System.out.print("Введите координату y: ");
		y = input.nextInt();
		
		res = ((y > 0 && y <= 4) && (x >= -2 && x <= 2)) || ((y >= -3 && y <= 0) && (x >= -4 && x <= 4));
		
		System.out.print(res);
		
		input.close();
	}

}
