/*
 * Дана строка json:
[{"фамилия":"Иванов","оценка":"5","предмет":"Математика"}, {"фамилия":"Петрова","оценка":"4","предмет":"Информатика"}, {"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
Написать метод, который распарсит этот текст и, используя StringBuilder, создаст строки вида:
Студент [фамилия] получил [оценка] по предмету [предмет]. Например:
Студент Иванов получил 5 по предмету Математика.
Студент Петрова получил 4 по предмету Информатика.
Студент Краснов получил 5 по предмету Физика.

 */

public class task_2 {
    
    private static String json = "[{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"}, {\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"}, {\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}]";
    public static void main(String[] args) {
        String[] arrayDataStrings = json.split("},");
        for (int i = 0; i < arrayDataStrings.length; i++) {
            String str = arrayDataStrings[i].trim().replaceAll("[\"{}\\[\\]]", "");
            System.out.println(PrintLine(str));
        }

    }

    public static StringBuilder PrintLine(String string) {
        String [] listName = {"Студент ", " получил ", " по предмету "};
        StringBuilder sb = new StringBuilder();
        String[] arrStrings = string.split(",");
        for (int i = 0; i < arrStrings.length; i++) {
            String[] arrTempStrings = arrStrings[i].split(":");
            sb.append(listName[i]);
            sb.append(arrTempStrings[1]);
        }
        return sb;

    }
}
