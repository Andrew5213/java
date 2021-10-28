package map;

import java.util.Map;
import java.util.TreeMap;

public class exemplo {
    public static void main(String[] args) {
        Map<String, String> cookies = new TreeMap<>();
        cookies.put("username", "maria");
        cookies.put("email", "maria@gmail.com");
        cookies.put("telefone", "9999999");

        cookies.remove("email");
        cookies.put("telefone", "888888");
        System.out.println("cotains phone key:"+cookies.containsKey("telefone") );
        System.out.println("numero de telefone "+cookies.get("telefone"));
        System.out.println("size"+cookies.size());
        for (String key : cookies.keySet()) {
            System.out.println(key + " : " + cookies.get(key));
        }
    }
}
