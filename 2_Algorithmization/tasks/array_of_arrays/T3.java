/*
 * Дана матрица. Вывести k-ю строку и p-й столбец матрицы.
 */
public class T3 {

	public static void main(String[] args) {
		int row = 7, col = 5;
		int[][] arr = new int[row][col];
		int k = 3, p = 2;
				
		// заполним матрицу случайными числами
		System.out.println("Исходная матрица: ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j ++) {
				arr[i][j] = (int) (Math.random() * row);
				System.out.print(arr[i][j] + " ");
			}
			System.out.print("\n");
		}
		
		System.out.print(k + "-я строка матрицы: ");
		for (int i = 0; i < arr[k - 1].length; i++) {
			System.out.print(arr[k - 1][i] + " ");
		}
		System.out.print("\n");
		
		System.out.println(p + "-й столбец матрицы: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i][p - 1]);
		}		
	}

}
