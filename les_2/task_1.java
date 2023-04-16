
// Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.

import java.util.Arrays;
import java.io.IOException;
import java.io.FileWriter;

public class task_1 {
    public static void main(String[] args) throws IOException {

        int[] arrayTemp = {2, 5, 1, -7, 3, 64, 0};
        System.out.println(Arrays.toString(arrayTemp));

        try (FileWriter fw = new FileWriter("log.txt")) {
            for (int out = arrayTemp.length - 1; out >= 1; out--) {
                for (int i = 0; i < out; i++) {
                    if(arrayTemp[i] > arrayTemp[i+1]) {
                        int temp = arrayTemp[i];
                        arrayTemp[i] = arrayTemp[i+1];
                        arrayTemp[i+1] = temp;
                    }
                }
                fw.append(Arrays.toString(arrayTemp)).append("\n");
                
            }
            System.out.println(Arrays.toString(arrayTemp));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }    
    }
}