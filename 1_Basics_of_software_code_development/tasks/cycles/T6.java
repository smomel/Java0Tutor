import java.io.IOException;

/*
 * Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера.
 */

public class T6 {

	public static void main(String[] args) throws IOException {
		char ch;
		
		System.out.print("Введите один символ: ");
		ch = (char) System.in.read();
		
		System.out.println("Числовое представление введенного символа: " + (int) ch);
	}	

}