/*
 * Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.
 */

public class T8 {

	public static void main(String[] args) {
		int num1 = 123, num2 = 456;
		char ch;
		String strRes = "";
		
		// преобразуем исходные числа в строки
		String str1 = Integer.toString(num1);
		String str2 = Integer.toString(num2);
		
		System.out.print("В числах " + num1 + " и " + num2);
		
		// последовательно перебираем все символы первого числа
		for (int i = 0; i < str1.length(); i++) {
			// для удобства записываем символ в переменную
			ch = str1.charAt(i);
			
			// последовательно перебираем символы второго числа и сравниваем с символом
			// при этом, если нашли совпадение, то дальше перебирать смысла нет
			int j = 0;
			while (j <= str2.length()-1) {
				
				if (ch == str2.charAt(j)) {
					strRes += (ch + " ");
					break;
				}
				j++;				
			} 			
		}
		
		// выводим результат
		if (strRes != "") {
			System.out.print(" есть одинаковые цифры: " + strRes);
		} else {
			System.out.print(" нет одинаковых цифр.");
		}

	}

}
