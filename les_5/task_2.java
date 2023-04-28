package les_5;

import java.util.*;

public class task_2 {

    public static List<String> fillList() { //создаем список имён
        String names = "Иван Иванов, Светлана Петрова, Кристина Белова, Анна Мусина, Анна Крутова, Иван Юрин," +
                " Петр Лыков, Павел Чернов, Иван Иванов, Петр Чернышов, Мария Федорова, Марина Светлова," +
                " Мария Савина, Иван Иванов, Мария Рыкова, Анна Крутова, Марина Лугова, Анна Владимирова," +
                " Петр Лыков, Иван Мечников, Петр Петин, Петр Лыков, Иван Ежов, Николай Викторов";
        List<String> listName = List.of(names.split(", "));
        return listName;
    }

    public static void printName() {
        List<String> namesList =fillList();
        ArrayList<String> name = getName(namesList);
        Map<String, Integer> mapName = getMap(name);
        System.out.println("___________________________________________________ ");
        System.out.println("                                                    ");
        System.out.println("Повторяющиеся имена: ");
        System.out.println("                                                    ");
        nameRepeat(mapName);
        System.out.println("___________________________________________________ ");
        System.out.println("                                                    ");
        System.out.println("Имена, отсортированные по убыванию популярности: ");
        System.out.println("                                                    ");
        sortName(mapName);
        System.out.println("___________________________________________________ ");
    }


    public static ArrayList<String> getName(List<String> list) {
        ArrayList<String> listName = new ArrayList<>();
        for (String el : list) {
            String[] elList = el.split(" ");
            listName.add(elList[0]);
        }
        return listName;
    }

    public static Map<String, Integer> getMap(ArrayList<String> name) {
        Map<String, Integer> mapName = new HashMap<>();
        for (int i = 0; i < name.size(); i++) {
            int count = 1;
            for (int j = i + 1; j < name.size(); j++) {
                if (name.get(i).equals(name.get(j))) count += 1;
            }
            if (!mapName.containsKey(name.get(i))) mapName.put(name.get(i), count);
        }
        return mapName;
    }

    public static void nameRepeat(Map<String, Integer> map) {
        for (var item : map.entrySet()) {
            if (item.getValue() > 1) System.out.printf("%s: %d \n", item.getKey(), item.getValue());
        }
    }

    public static void sortName(Map<String, Integer> map) {
        Map<Integer, ArrayList<String>> sortMap = new HashMap<>();
        ArrayList<Integer> listCount = new ArrayList<>();
        for (var item : map.entrySet()) {
            if (!listCount.contains(item.getValue())) listCount.add(item.getValue());
        }
        listCount.sort(null);
        for (int i = listCount.size() - 1; i > -1; i--) {
            for (var item : map.entrySet()) {
                if (Objects.equals(listCount.get(i), item.getValue()))
                    System.out.printf("%s : %d \n", item.getKey(), item.getValue());
            }
        }
    }


    public static void main(String[] args) {
        printName();
    }
}
