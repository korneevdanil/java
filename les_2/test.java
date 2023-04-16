/*
 * for (String s : arrayData) {
                        if (s.split(":")[0].trim().replaceAll("[\"{}\\[\\]]", "").equals("фамилия")) {
                                sb.append("Студент ").append(s.replaceAll("[\"{}\\[\\]]", "").split(":")[1]);
                        }
                        if (s.split(":")[0].trim().replaceAll("[\"{}\\[\\]]", "").equals("оценка")) {
                                sb.append(" получил(а) ").append(s.split(":")[1].replaceAll("[\"{}\\[\\]]",""));
                        }
                        if (s.split(":")[0].trim().replaceAll("[\"{}\\[\\]]", "").equals("предмет")) {
                                sb.append(" по предмету  ").append(s.split(":")[1].replaceAll("[\"{}\\[\\]]","")).append(".\n");
                        }
                }
 * 
 */



public class test {

    private static String json = "[{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"}, {\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"}, {\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}]";

    
    public static void main(String[] args) {
        String[] arrayData = json.split("},");
        StringBuilder sb = new StringBuilder();
        for( int i = 0; i < arrayData.length; i++) {
            String str = arrayData[i].replaceAll("[\"{}\\[\\]]", "");
            sb.append(str);
            

        }

        System.out.println(sb);
    }
    
}
