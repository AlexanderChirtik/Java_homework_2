//Дана строка sql-запроса "select * from students where ".
// Сформируйте часть WHERE этого запроса, используя StringBuilder.
// Данные для фильтрации приведены ниже в виде json строки.

import java.util.HashMap;
import java.util.Map;

public class Task1 {

    public static void main(String[] args) {
        String startOfQuery = "select * from students where ";
        Map<String, String> params = new HashMap<String,String>();
        params.put("name","Ivanov");
        params.put("country","Russia");
        params.put("city","Moscow");
        params.put("age",null);
        System.out.println(startOfQuery + GenerateRequest(params));
    }
    public static String GenerateRequest(Map<String, String> params)
    {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String,String> pair : params.entrySet())
        {
            if (pair.getValue() != null)
            {
                sb.append(pair.getKey() +" = '" + pair.getValue()+"' and ");
            }
        }
        sb.delete(sb.toString().length()-5,sb.toString().length());
        return sb.toString();
    }

}