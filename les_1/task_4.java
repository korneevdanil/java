package les_1;

/**
 * Реализовать простой калькулятор
 */


 // почему то закрытие сканера вызывает ошибку?

 
import java.util.Scanner;

public class task_4 {
    // ввод оператора
    static String scanOperations() {
        Scanner iScanner = new Scanner(System.in);
        String operations = iScanner.nextLine();
        return operations;
    }

    // метод получения результата
    static int getResult(String opr, int num1, int num2) {
        int result = 0;
        switch (opr) {
            case "+" -> result = num1 + num2;
            case "-" -> result = num1 - num2;
            case "*" -> result = num1 * num2;
            case "/" -> result = num1 / num2;
        }
        return result;
 
    }
 
    public static void main(String[] args) {
        Scanner nScanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int num1 = nScanner.nextInt();
        System.out.println("Введите оператор: -, +, *, /");
        String operations = scanOperations();
        System.out.println("Введите второе число: ");
        int num2 = nScanner.nextInt();
        int result = getResult(operations, num1, num2);
        System.out.printf("%d %s %d = %d", num1, operations, num2, result);
 
    }
 
}
