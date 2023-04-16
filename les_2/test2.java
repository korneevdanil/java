

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Random;

public class test2 {

    public static void main(String[] args) {

        boolean flag = false;
            int buf = 0;
            int[] arr = new int[]{6, 2, 5, 4, 2, 9, 10};
            try {
                FileWriter fw = new FileWriter("bubble.txt");
                while (!flag) {
                    flag = true;
                    for (int i = 0; i < arr.length - 1; i++) {
                        if (arr[i] > arr[i + 1]) {
                            flag = false;
                            buf = arr[i];
                            arr[i] = arr[i + 1];
                            arr[i + 1] = buf;
                            fw.append(Arrays.toString(arr)).append("\n");
                        }
                        
                    }
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        
    }
}