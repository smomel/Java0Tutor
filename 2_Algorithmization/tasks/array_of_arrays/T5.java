/*
 * Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
 *
 */
public class T5 {

	public static void main(String[] args) {
		int n = 6;
		int[][] arr = new int[n][n];
				
		System.out.println("Полученная матрица: ");
		
		// формируем матрицу	
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - i; j ++) {				
				arr[i][j] = i + 1;				
			}
		}
		
		// выведем результат на экран
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
