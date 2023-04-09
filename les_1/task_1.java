package les_1;

import java.util.Scanner;

/**
 * Вычислить n-ое треугольного число (сумма чисел от 1 до n),
 * 
 */
public class task_1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in); // Определяем сканер
        System.out.println("Ведите n-ое число: "); // Запрашиваем у пользователя число
        int i = iScanner.nextInt();
        System.out.printf("Треугольное число: %d\n", genMyNum(i));
        iScanner.close();
    }

    public static int genMyNum(int a) { // функция вычисления 
        return (a * (a + 1)) /2;
        
    }
}
