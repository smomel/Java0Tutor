/*
 * Вычислить значение функции:
 */

public class T5 {

	public static void main(String[] args) {
		double x = 0;
						
		double Fx = (x <= 3) ? x * x - 3 * x + 9 : 1 / (Math.pow(x, 3) + 6); 
		
		System.out.println("Значение функции Fx=" + Fx);

	}

}
