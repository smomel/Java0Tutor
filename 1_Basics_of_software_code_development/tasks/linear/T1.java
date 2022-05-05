/*
    Задача:
    Найдите значение функции: z = ((a - 3) * b / 2) + c
*/
import java.util.Scanner;

class T1 {
    public static void main (String[] args) {
        // объявляем переменные вещественного типа без начальной инициализации
        float a, b, c, z;
        Scanner input = new Scanner(System.in);

        // просим пользователя задать произвольное значение для переменных формулы
        System.out.print("Задайте ЧИСЛОВОЕ значение переменной 'a': ");
        a = input.nextFloat();
        System.out.print("Задайте ЧИСЛОВОЕ значение переменной 'b': ");
        b = input.nextFloat();
        System.out.print("Задайте ЧИСЛОВОЕ значение переменной 'c': ");
        c = input.nextFloat();

        // вычисляем значение формулы
        z = ((a - 3) * b / 2) + c;

        // выводим на экран результат вычисления
        System.out.println("Результат вычисления формулы: " + z);
    }
}
