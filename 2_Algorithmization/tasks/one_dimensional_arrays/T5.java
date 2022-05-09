/*
 * Даны целые числа а 1 ,а 2 ,..., а n . Вывести на печать только те числа, для которых а i > i.
 */
public class T5 {

	public static void main(String[] args) {
		int[] an; 
		int n = 20;
		
		an = new int[n];
		System.out.println("Элементы массива:");
		
		// заполним массив случайными натуральными числами
		for (int i = 0; i < n; i++) {
			an[i] = (int) (Math.random() * n + 1);
			System.out.print(an[i] + " ");
		}
		
		System.out.println();
		System.out.println("Элементоы, для которых ai > i: ");
		
		for (int i = 0; i < n; i++) {
			
			if (an[i] > i + 1) System.out.print(an[i] + " ");
		}
		
	}

}
