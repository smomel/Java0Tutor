/*
 * Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.
 */
public class T1 {

	public static void main(String[] args) {
		int row = 7, col = 5;
		int[][] arr = new int[row][col];
		boolean isColumnExist = false;
				
		// заполним матрицу случайными числами
		System.out.println("Исходная матрица: ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j ++) {
				arr[i][j] = (int) (Math.random() * row);
				System.out.print(arr[i][j] + " ");
			}
			System.out.print("\n");
		}
		System.out.println();
		
		System.out.println("Нечетные столбцы, у которых первый элемент больше последнего:");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j = j + 2) {
				
				int firstElement = arr[0][j];
				int lastElement = arr[arr.length - 1][j];				
				
				if (firstElement > lastElement) {
					System.out.print(arr[i][j] + " ");
					isColumnExist = true;
				}
			}
			
			if (isColumnExist) System.out.println();
		}
		
		if (!isColumnExist) System.out.println("\tтаких столбцов нет");

	}

}
