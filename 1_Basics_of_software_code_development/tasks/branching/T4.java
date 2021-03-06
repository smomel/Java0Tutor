/*
 * Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. Определить, пройдет ли кирпич через
 * отверстие.
 */

public class T4 {

	public static void main(String[] args) {
		// размеры прямоугольного отверстия
		int A = 21;
		int B = 11;
		
		// размеры кирпича
		int x = 40, y = 5, z = 10;		
		
		boolean res = (x < A) && ((y < B) || (z < B)) || (y < A) && ((x < B) || (z < B)) || (z < A) && ((x < B) || (y < B));
		
		if ( res ) {
			System.out.printf("Кирпич с размерами %dx%dx%d пройдет через отверстие размером %dx%d", x, y, z, A, B);
		} else {
			System.out.printf("Кирпич с размерами %dx%dx%d не пройдет через отверстие размером %dx%d", x, y, z, A, B);
		}
	}

}
