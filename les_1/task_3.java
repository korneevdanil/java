
//

package les_1;

import java.util.ArrayList;
import java.util.Scanner;

public class task_3 {
    public static void main(String[] args) {
        Scanner nScanner = new Scanner(System.in);
        System.out.println("У нас есть 168 простых чисел");
        System.out.println("Сколько простых чисел вывести? (начиная с первого)");
        int n = nScanner.nextInt();
        nScanner.close();
        ArrayList<Integer> al = new ArrayList<Integer>();

        for (int i = 2; i <= 1000; i++) {
            boolean flag = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) al.add(i);
            else flag = true;
        }
        for (int i = 0; i < n; i++) {
            System.out.println("-");
            System.out.println(al.get(i));
        }
    }
}