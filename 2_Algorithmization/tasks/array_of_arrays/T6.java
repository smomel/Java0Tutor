/*
 * Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
 */
public class T6 {

	public static void main(String[] args) {
		int n = 6;
		int[][] arr = new int[n][n];
				
		System.out.println("Полученная матрица: ");
		
		// формируем матрицу	
		int k = 0;
		
		for (int i = 0; i < arr.length; i++) {				
			for (int j = k; j < arr.length - k; j ++) {				
				arr[i][j] = 1;
			}
			
			if ((i + 1) < n/2) k++;
			else if ((i + 1) > n/2) k--; 
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
