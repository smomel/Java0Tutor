/*
 * Сформировать квадратную матрицу порядка N по правилу:
 * и подсчитать количество положительных элементов в ней.
 */
public class T7 {

	public static void main(String[] args) {
		int n = 5;
		double[][] arr = new double[n][n];
		int numPositiveElements = 0;
				
		System.out.println("Полученная матрица: ");
		
		// формируем матрицу	
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j ++) {				
				
				arr[i][j] = Math.sin( ((i+1)*(i+1) - (j+1)*(j+1)) / n );
				
				if (arr[i][j] > 0) numPositiveElements++;
			}
		}
		
		// выведем результат на экран
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print((float) arr[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("Количество положительных элементов в ней: " + numPositiveElements);

	}

}
