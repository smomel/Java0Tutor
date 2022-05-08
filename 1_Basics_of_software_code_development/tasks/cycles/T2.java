/*
 * Вычислить значения функции на отрезке [а,b] c шагом h:
 */

public class T2 {

	public static void main(String[] args) {
		int a=0, b=10;
		int h = 1;
		
		System.out.println("Значения функции на отрезке [" + a + ", " + b + "] с заданным шагом h=" + h);
		
		for (int x = a; x <= b; x = x + h) {
			
			if (x > 2) {
				System.out.println("x=" + x + ", y = " + x);
			} else {
				System.out.println("x=" + x + ", y = " + -x);
			}
		}
	}

}
