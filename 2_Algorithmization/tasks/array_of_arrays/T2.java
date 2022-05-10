/*
 * Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.
 */
public class T2 {

	public static void main(String[] args) {
		int row = 7;
		int[][] arr = new int[row][row];
				
		// заполним матрицу случайными числами
		System.out.println("Исходная матрица: ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j ++) {
				arr[i][j] = (int) (Math.random() * row);
				System.out.print(arr[i][j] + " ");
			}
			System.out.print("\n");
		}
		
		System.out.print("Элементы стоящие на диагонали: ");
		for (int i = 0; i < arr.length; i ++) {
			System.out.print(arr[i][i] + " ");
		}
	}

}
