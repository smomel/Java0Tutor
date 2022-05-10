/*
 * Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
 */
public class T4 {

	public static void main(String[] args) {
		int n = 6;
		int[][] arr = new int[n][n];
				
		System.out.println("Полученная матрица: ");
		
		// формируем матрицу и выводим на экран		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j ++) {
				
				switch ((i + 1) % 2) {
					case 1: {
						arr[i][j] = j + 1;
						break;
					}
					case 0: {
						arr[i][j] = arr.length - j;
						break;
					}
				}
				
				System.out.print(arr[i][j] + " ");
			}
			
			System.out.println();
			
		}
		
	}

}
