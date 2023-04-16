

// Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.

import java.util.Arrays;
import java.util.logging.*;
import java.io.IOException;


public class task_1 {


    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getLogger(task_1.class.getName());
        FileHandler fh = new FileHandler("log.txt");
        logger.addHandler(fh);
        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);


        int[] arrayTemp = {2, 5, 1, -7, 3, 64, 0};
        System.out.println(Arrays.toString(arrayTemp));
        for (int out = arrayTemp.length - 1; out >= 1; out--) {
            for (int i = 0; i < out; i++) {
                if(arrayTemp[i] > arrayTemp[i+1]) {
                    int temp = arrayTemp[i];
                    arrayTemp[i] = arrayTemp[i+1];
                    arrayTemp[i+1] = temp;
                }
                
            }
            logger.info(Arrays.toString(arrayTemp));
        }
        System.out.println(Arrays.toString(arrayTemp));



    }
}