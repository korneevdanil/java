
// n! (произведение чисел от 1 до n)

package les_1;

import java.util.Scanner;

public class task_2 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите n-ое (целое) число: ");
        int i = iScanner.nextInt();
        System.out.printf("Произведение n: % .1f", myFactorial(i));
        iScanner.close();
    }
    
    public static double myFactorial(int f) {
        if (f == 1) return 1;
        return f * myFactorial(f - 1);
    }

    
}
