
package les_5;

import java.util.*;


public class task_1 {

    public static void main(String[] args) {

        Map<Integer,String> map1 = new LinkedHashMap<>();
        map1.put(123456,"Иванов");
        map1.put(321456,"Сидоров");
        map1.put(234432, "Петров");
        map1.put(654321, "Петрова");
        map1.put(345678, "Иванов");

        System.out.println(map1);

        
        for(Map.Entry<Integer, String> entry : map1.entrySet()) {
            if(entry.getValue().equals("Иванов")){
                System.out.println(entry);
            }
        }
    }
    
}
